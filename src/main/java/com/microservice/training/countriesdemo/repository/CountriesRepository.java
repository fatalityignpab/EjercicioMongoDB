package com.microservice.training.countriesdemo.repository;

import com.microservice.training.countriesdemo.model.Country;
import com.microservice.training.countriesdemo.model.utils.AfricaContinentList;
import com.microservice.training.countriesdemo.model.utils.AsiaContinentList;
import com.microservice.training.countriesdemo.model.utils.EuropeContinentList;
import com.microservice.training.countriesdemo.model.utils.NorthAmericaContinentList;
import com.microservice.training.countriesdemo.repository.api.ICountriesRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CountriesRepository implements ICountriesRepository {

  public List<Country> findAllAfricaCountries(){
    return AfricaContinentList.getAllContinentCountries();
  }

  public List<Country> findAllEuropeCountries() {
    return EuropeContinentList.getAllContinentCountries();
  }

  public List<Country> findAllAsiaCountries() {
    return AsiaContinentList.getAllContinentCountries();
  }

  public List<Country> findAllNorthAmericaCountries() {
    return NorthAmericaContinentList.getAllContinentCountries();
  }
  
}
