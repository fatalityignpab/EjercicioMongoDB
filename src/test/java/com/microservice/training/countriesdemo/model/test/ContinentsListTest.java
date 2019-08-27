package com.microservice.training.countriesdemo.model.test;

import java.util.List;

import org.junit.Test;

import com.microservice.training.countriesdemo.model.Country;
import com.microservice.training.countriesdemo.model.utils.AfricaContinentList;
import com.microservice.training.countriesdemo.model.utils.AsiaContinentList;
import com.microservice.training.countriesdemo.model.utils.EuropeContinentList;
import com.microservice.training.countriesdemo.model.utils.NorthAmericaContinentList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContinentsListTest {

	@Test
	public void generateMongoScript() {

		List<Country> europeList = EuropeContinentList.getAllContinentCountries();
		for (Country c : europeList) {
			log.info("var country = {\"name\": \"{}\", \"capital\":\"{}\", \"continent\":\"{}\"};", c.getCountryName(),
					c.getCapitalName(), c.getContinent());
			log.info("db.countries.save(country);");
		}
		
		List<Country> africaList = AfricaContinentList.getAllContinentCountries();
		for (Country c : africaList) {
			log.info("var country = {\"name\": \"{}\", \"capital\":\"{}\", \"continent\":\"{}\"};", c.getCountryName(),
					c.getCapitalName(), c.getContinent());
			log.info("db.countries.save(country);");
		}
		
		List<Country> asiaList = AsiaContinentList.getAllContinentCountries();
		for (Country c : asiaList) {
			log.info("var country = {\"name\": \"{}\", \"capital\":\"{}\", \"continent\":\"{}\"};", c.getCountryName(),
					c.getCapitalName(), c.getContinent());
			log.info("db.countries.save(country);");
		}
		
		List<Country> northAmericaList = NorthAmericaContinentList.getAllContinentCountries();
		for (Country c : northAmericaList) {
			log.info("var country = {\"name\": \"{}\", \"capital\":\"{}\", \"continent\":\"{}\"};", c.getCountryName(),
					c.getCapitalName(), c.getContinent());
			log.info("db.countries.save(country);");
		}
		
	}

}
