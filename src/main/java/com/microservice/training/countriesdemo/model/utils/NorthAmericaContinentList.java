package com.microservice.training.countriesdemo.model.utils;

import com.microservice.training.countriesdemo.model.Continent;
import com.microservice.training.countriesdemo.model.Country;
import java.util.ArrayList;
import java.util.List;

public class NorthAmericaContinentList {

  public static List<Country> getAllContinentCountries() {

    List<Country> northAmericaCountries = new ArrayList<>();


    northAmericaCountries
        .add(new Country("Antigua and Barbuda", "St. John's", Continent.NORTH_AMERICA));
    northAmericaCountries.add(
        new Country("Aruba", "Oranjestad (Constituent country of the Kingdom of the Netherlands)",
            Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("The Bahamas", "Nassau", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Barbados", "Bridgetown", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Belize", "Belmopan", Continent.NORTH_AMERICA));
    northAmericaCountries
        .add(new Country("Bonaire", "part of the Netherlands", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("British Virgin Islands", "Road Town (territory of U.K.)",
        Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Canada", "Ottawa", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Costa Rica", "San José", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Cuba", "Havana", Continent.NORTH_AMERICA));
    northAmericaCountries.add(
        new Country("Curaçao", "Willemstad (Constituent country of the Kingdom of the Netherlands)",
            Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Dominica", "Roseau", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Dominican Republic (Republica Dominicana)",
        "Santo Domingo", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("El Salvador", "San Salvador", Continent.NORTH_AMERICA));
    northAmericaCountries
        .add(new Country("Greenland", "Nuuk (territory of Denmark)", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Grenada", "St George's", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Guatemala", "Guatemala", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Haiti", "Pora Prince", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Honduras", "Tegucigalpa", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Jamaica", "Kingston", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Mexico", "Mexico City", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Montserrat",
        "Plymouth, Brades, Little Bay (territory of U.K.)", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Navassa Island", "Washinton, D.C. (territory of U.S.)",
        Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Nicaragua", "Managua", Continent.NORTH_AMERICA));
    northAmericaCountries
        .add(new Country("Panama (Panamá)", "Panama City", Continent.NORTH_AMERICA));
    northAmericaCountries
        .add(new Country("Puerto Rico", "San Juan (territory of U.S.)", Continent.NORTH_AMERICA));
    northAmericaCountries
        .add(new Country("Saint Kitts and Nevis", "Basseterre", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Saint Lucia", "Castries", Continent.NORTH_AMERICA));
    northAmericaCountries
        .add(new Country("Saint Vincent and the Grenadines", "Kingstown", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Sint Maarten",
        "Philipsburg (Constituent country of the Kingdom of the Netherlands)",
        Continent.NORTH_AMERICA));
    northAmericaCountries
        .add(new Country("Trinidad and Tobago", "Port of Spain", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("Turks and Caicos",
        "Cockburn Town (British Overseas Territory)", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("United States of America",
        "Washington, District of Columbia", Continent.NORTH_AMERICA));
    northAmericaCountries.add(new Country("US Virgin Islands",
        "Charlotte Amalie (territory of U.S.)", Continent.NORTH_AMERICA));

    return northAmericaCountries;

  }

}
