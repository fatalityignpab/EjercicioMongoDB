package com.microservice.training.countriesdemo.model.utils;

import com.microservice.training.countriesdemo.model.Continent;
import com.microservice.training.countriesdemo.model.Country;
import java.util.ArrayList;
import java.util.List;

public class EuropeContinentList {

  public static List<Country> getAllContinentCountries() {

    List<Country> europeCountries = new ArrayList<>();

    europeCountries.add(new Country("Albania", "Tirana", Continent.EUROPE));
    europeCountries.add(new Country("Andorra", "Andorra la Vella", Continent.EUROPE));
    europeCountries.add(new Country("Austria", "Vienna", Continent.EUROPE));
    europeCountries.add(new Country("Belarus", "Minsk", Continent.EUROPE));
    europeCountries.add(new Country("Belgium", "Brussels", Continent.EUROPE));
    europeCountries.add(new Country("Bosnia and Herzegovina", "Sarajevo", Continent.EUROPE));
    europeCountries.add(new Country("Bulgaria", "Sofia", Continent.EUROPE));
    europeCountries.add(new Country("Croatia", "Zagreb", Continent.EUROPE));
    europeCountries.add(new Country("Czech Republic", "Prague", Continent.EUROPE));
    europeCountries.add(new Country("Denmark", "Copenhagen", Continent.EUROPE));
    europeCountries.add(new Country("Estonia", "Tallinn", Continent.EUROPE));
    europeCountries.add(new Country("Finlay", "Helsinki", Continent.EUROPE));
    europeCountries.add(new Country("France", "Paris", Continent.EUROPE));
    europeCountries.add(new Country("Germany", "Berlin", Continent.EUROPE));
    europeCountries.add(new Country("Greece", "Athens", Continent.EUROPE));
    europeCountries.add(new Country("Hungary", "Budapest", Continent.EUROPE));
    europeCountries.add(new Country("Iceland", "Reykjavik", Continent.EUROPE));
    europeCountries.add(new Country("Republic of Ireland", "Dublin", Continent.EUROPE));
    europeCountries.add(new Country("Italy", "Rome", Continent.EUROPE));
    europeCountries.add(new Country("Kosovo", "Pristina", Continent.EUROPE));
    europeCountries.add(new Country("Latvia", "Riga", Continent.EUROPE));
    europeCountries.add(new Country("Liechtenstein", "Vaduz", Continent.EUROPE));
    europeCountries.add(new Country("Lithuania", "Vilnius", Continent.EUROPE));
    europeCountries.add(new Country("Luxembourg", "Luxembourg City", Continent.EUROPE));
    europeCountries.add(new Country("Macedonia", "Skopje", Continent.EUROPE));
    europeCountries.add(new Country("Malta", "Valletta", Continent.EUROPE));
    europeCountries.add(new Country("Moldova", "Chisinau", Continent.EUROPE));
    europeCountries.add(new Country("Monaco", "Monte Carlo Quarter", Continent.EUROPE));
    europeCountries.add(new Country("Montenegro", "Podgorica", Continent.EUROPE));
    europeCountries.add(new Country("Netherlands", "Amsterdam (Capital)", Continent.EUROPE));
    europeCountries.add(new Country("Norway", "Oslo", Continent.EUROPE));
    europeCountries.add(new Country("Poland", "Warsaw", Continent.EUROPE));
    europeCountries.add(new Country("Portugal", "Lisbon", Continent.EUROPE));
    europeCountries.add(new Country("Romania", "Bucharest", Continent.EUROPE));
    europeCountries.add(new Country("San Marino", "San Marino", Continent.EUROPE));
    europeCountries.add(new Country("Serbia", "Belgrade", Continent.EUROPE));
    europeCountries.add(new Country("Slovakia", "Bratislava", Continent.EUROPE));
    europeCountries.add(new Country("Slovenia", "Ljubljana", Continent.EUROPE));
    europeCountries.add(new Country("Spain", "Madrid", Continent.EUROPE));
    europeCountries.add(new Country("Sweden", "Stockholm", Continent.EUROPE));
    europeCountries.add(new Country("Switzerland", "Bern", Continent.EUROPE));
    europeCountries.add(new Country("Ukraine", "Kyiv or Kiev", Continent.EUROPE));
    europeCountries.add(new Country("United Kingdom", "London", Continent.EUROPE));
    europeCountries.add(new Country("Vatican City", "Vatican City", Continent.EUROPE));
    
    return europeCountries;
  }

}
