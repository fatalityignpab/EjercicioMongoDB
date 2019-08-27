package com.microservice.training.countriesdemo.controller;

import com.microservice.training.countriesdemo.errorhandling.InvalidContinentException;
import com.microservice.training.countriesdemo.model.entity.CountryDocument;
import com.microservice.training.countriesdemo.service.api.ICountriesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class CountriesController {

      @Autowired
      ICountriesService countriesService;

      // Se cambió de Country a CountryDocument
      @GetMapping(path = "/countries/continent/name/{continent}")
      public ResponseEntity<List<CountryDocument>> findCountryByContinent(
                  @PathVariable(name = "continent") String continentName) {
            return new ResponseEntity<List<CountryDocument>>(
                        countriesService.findCountriesByContinentName(continentName), HttpStatus.OK);
      }

      // Se cambió de Country a CountryDocument
      @GetMapping(path = "/countries/continent/id/{continent}")
      public ResponseEntity<List<CountryDocument>> findCountryByContinent(
                  @PathVariable(name = "continent") Integer continentId) {
            return new ResponseEntity<List<CountryDocument>>(countriesService.findCountriesByContinentId(continentId),
                        HttpStatus.OK);
      }

      // Se agregó la variable de name como Nombre del País
      @GetMapping(path = "/country/name/{name}")
      public ResponseEntity<Optional<CountryDocument>> findCountryByName(
                  @PathVariable(name = "name") String countryName) {
            // Se creó una condición si no encuentra el país (si encuentra, responde 200,
            // sino, responde 500)
            if (countriesService.findCountryByName(countryName).isPresent())
                  return new ResponseEntity<Optional<CountryDocument>>(countriesService.findCountryByName(countryName),
                              HttpStatus.OK);
            else
                  throw new InvalidContinentException("Country name: " + countryName + " does not exist.");
      }

      @PostMapping(path = "/country", consumes = "application/json", produces = "application/json")
      public ResponseEntity<Optional<CountryDocument>> saveCountryByName(@RequestBody CountryDocument document) { // @RequestBody
                                                                                                                  // CountryDocument
                                                                                                                  // saveDocument
            return new ResponseEntity<Optional<CountryDocument>>(countriesService.saveContinent(document),
                        HttpStatus.CREATED);
      }
}
