package com.microservice.training.countriesdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Country {

  private String countryName;
  
  private String capitalName;
  
  private Continent continent;
  
}
