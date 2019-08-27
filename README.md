## Ejercicio de una API alimentada con MongoDB 🚀

Se realizó los siguientes cambios: 😎
1. Para leer los datos del MongoDB sin usar los datos en Java, cambie en el Controlador y el Servicio la palabra [Country a CountryDocument](#country-a-countrydocument)
    - Como detalle, le implementé los errores ya construidos en caso que el usuario no escriba correctamente la ID y el Nombre del continente.
3. Para el TomCat configuré el puerto a 8082
4. En el modelo, agregue las [columnas](#columnas) de la BD de MongoDB para que reconozca hacia donde debe de llenar

---

<img src="https://geeksjavamexico.files.wordpress.com/2017/09/spring-framework.png?w=640" title="Spring" alt="Spring" height="50%" width="50%">

---

## Country a CountryDocument
**CountriesController.java**
```java
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
```
**CountriesService.java**
```java
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
```

---

## Columnas
**CountryDocument.java**
```java
	// Instanceamos las variables por los nombres de los campos que mongoDB tiene
	@Field("name")
	String name;

	@Field("capital")
	String capital;
	
	@Field("continent")
	String continent;
```

---

***PRUEBAS***

**Continente por nombre**
![Continente por nombre](http://g.recordit.co/FPaMB6uznP.gif)
**Crear País**
![Crear País](http://g.recordit.co/TI9IC95flL.gif)