package com.microservice.training.countriesdemo.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "countries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CountryDocument {

	@Id
	String id;

	// Instanceamos las variables por los nombres de los campos que mongoDB tiene
	@Field("name")
	String name;

	@Field("capital")
	String capital;
	
	@Field("continent")
	String continent;
	
}
