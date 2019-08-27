package com.microservice.training.countriesdemo.service;

import com.microservice.training.countriesdemo.errorhandling.InvalidContinentException;
//import com.microservice.training.countriesdemo.errorhandling.InvalidContinentException; // No se usó
import com.microservice.training.countriesdemo.model.Continent;
//import com.microservice.training.countriesdemo.model.Country;
//import com.microservice.training.countriesdemo.repository.api.ICountriesRepository; // Se sustituyeron
import com.microservice.training.countriesdemo.service.api.ICountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// Se agrego estas 2 librerías
import com.microservice.training.countriesdemo.model.entity.CountryDocument;
import com.microservice.training.countriesdemo.repository.api.CountriesMongoRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class CountriesService implements ICountriesService {

  ArrayList<String> arregloContinentes = new ArrayList<>(
      Arrays.asList("africa", "europe", "asia", "north_america", "south_america"));
  
  

  @Autowired
  CountriesMongoRepository countriesRepository; // Se cambió de ICountriesRepository a CountriesMongoRepository

  // Se cambió de Country a CountriesMongoRepository
  public List<CountryDocument> findCountriesByContinentName(String continentName) {
    if (arregloContinentes.stream().anyMatch(val -> val.equals(continentName)))
      return countriesRepository.findByContinent(String.valueOf(Continent.continentByName(continentName)));
    else
      throw new InvalidContinentException("Continent name: " + continentName + " does not exist.");
  }

  // Se cambió de Country a CountriesMongoRepository
  public List<CountryDocument> findCountriesByContinentId(Integer continentId) {
    // Se agregó la conversión de Continente a String
    if (continentId >= 1 && continentId <= 5)
      return countriesRepository.findByContinent(String.valueOf(Continent.continentById(continentId)));
    else
      throw new InvalidContinentException("Continent id: " + String.valueOf(continentId) + " does not exist.");
  }

  @Override
  public Optional<CountryDocument> findCountryByName(String countryName) {
    return countriesRepository.findByName(countryName);
  }

  // Se probo con SoapUI alimentando a un JSON para pruebas
  @Override
  public Optional<CountryDocument> saveContinent(CountryDocument document) {
    countriesRepository.save(document);
    return countriesRepository.findById(document.getId());
  }

}
