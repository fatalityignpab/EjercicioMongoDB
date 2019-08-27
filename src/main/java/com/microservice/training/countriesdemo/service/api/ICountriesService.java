package com.microservice.training.countriesdemo.service.api;

//import com.microservice.training.countriesdemo.model.Country; // Se cambio de Country a CountryDocument
import com.microservice.training.countriesdemo.model.entity.CountryDocument;

import java.util.List;
import java.util.Optional;

public interface ICountriesService {
  // Se cambio de Country a CountryDocument
  List<CountryDocument> findCountriesByContinentName(String continentName);
  // Se cambio de Country a CountryDocument
  List<CountryDocument> findCountriesByContinentId(Integer continentId);

  Optional<CountryDocument> findCountryByName(String countryName);

  Optional<CountryDocument> saveContinent(CountryDocument document);
  
}
