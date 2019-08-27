package com.microservice.training.countriesdemo.repository.mongo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.microservice.training.countriesdemo.model.Continent;
import com.microservice.training.countriesdemo.model.entity.CountryDocument;
import com.microservice.training.countriesdemo.repository.api.CountriesMongoRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class CountriesRepositoryTest {

	@Autowired
	CountriesMongoRepository mongoRepository;
	
	@Before
	public void setUp() {
		assertNotNull(mongoRepository);
	}
	
	@Test
	public void findById() {
		
		log.info("Testing MongoRepository findById feature");
		
		String countryId = "5d5f03174bb837722a424cbf";
		Optional<CountryDocument> countryOpt = mongoRepository.findById(countryId);
		
		if (countryOpt.isPresent()) {
			CountryDocument country = countryOpt.get();
			
			assertThat(country.getContinent()).isEqualToIgnoringCase(Continent.NORTH_AMERICA.getContinentName());
			assertThat(country.getName()).isEqualToIgnoringCase("mexico");
			
			log.info("Country found: {}", country);
		} else {
			log.error("COUNTRY WAS NOT FOUND FOR ID: {}", countryId);
		}
		
	}
	
	@Test
	public void saveDummyCountry() {
		
		log.info("Testing MongoRepository save update and delete feature");
		
		CountryDocument countryToSave = new CountryDocument();
		String name = "IBM country";
		String capital = "Mexico city";
		String continentName = Continent.NORTH_AMERICA.getContinentName();
		
		countryToSave.setName(name);
		countryToSave.setCapital(capital);
		countryToSave.setContinent(continentName);
		
		log.info("Country before saving: {}", countryToSave);
		
		CountryDocument savedDocument = mongoRepository.save(countryToSave);
		
		log.info("Country after saving: {}", countryToSave);
		log.info("Saved country after saving: {}", savedDocument);
		
		Optional<CountryDocument> countryByName = mongoRepository.findByName(name);
		
		if (countryByName.isPresent()) {
			CountryDocument country = countryByName.get();
			
			assertThat(country.getContinent()).isEqualToIgnoringCase(Continent.NORTH_AMERICA.getContinentName());
			assertThat(country.getName()).isEqualToIgnoringCase(name);
			
			log.info("Country found: {}", country);
			
			mongoRepository.delete(country);
			
			Optional<CountryDocument> countryByNameOpt = mongoRepository.findByName(name);
			
			assertThat(countryByNameOpt).isEmpty();
			
		} else {
			throw new RuntimeException("INCONSISTENT INFORMATION IN MONGO");
		}
		
	}
	
}
 