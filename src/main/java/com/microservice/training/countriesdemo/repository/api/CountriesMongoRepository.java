package com.microservice.training.countriesdemo.repository.api;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservice.training.countriesdemo.model.entity.CountryDocument;

@Repository
public interface CountriesMongoRepository extends CrudRepository<CountryDocument, String> {

	List<CountryDocument> findByCapital(String capital);
	List<CountryDocument> findByContinent(String continent);
	List<CountryDocument> findById(Integer continentId);
	Optional<CountryDocument> findByName(String name);
 
}
