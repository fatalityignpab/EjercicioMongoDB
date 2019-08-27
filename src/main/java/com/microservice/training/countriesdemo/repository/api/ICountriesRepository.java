package com.microservice.training.countriesdemo.repository.api;

import com.microservice.training.countriesdemo.model.Country;
import java.util.List;

public interface ICountriesRepository {

  List<Country> findAllAfricaCountries();
  
  List<Country> findAllEuropeCountries();
  
  List<Country> findAllAsiaCountries();
  
  List<Country> findAllNorthAmericaCountries();
  
}
