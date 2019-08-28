## Ejercicio de una API alimentada con MongoDB 🚀

Se realizó los siguientes cambios: 😎
1. Para leer los datos del MongoDB sin usar los datos en Java en la parte de continente (nombre y id), cambie en el Controlador y el Servicio la palabra [Country a CountryDocument](#country-a-countrydocument)
    - Como detalle, le implementé los [errores](#manejo-de-errores) ya construidos en caso que el usuario no escriba correctamente la ID y el Nombre del continente.
2. Para leer los datos de acuerdo al parametro *name*, en el Controlador y Servicio, se agregó el método de [buscar por nombre](#buscar-por-nombre).
3. Para crear un documento de MongoDB, en el Controlador y Servicio, se agregó el método de [crear documento](#crear-documento), pero para que funcione, se probó en SoapUI para que cargue un JSON en el Body (*@Requestbody*).
4. Para el TomCat configuré el [puerto a 8082](#puerto)
5. En el modelo, agregue las [columnas](#columnas) de la BD de MongoDB para que reconozca hacia donde debe de llenar
6. Para ver cómo responde el GET y el POST, se creó las visualizaciones de cómo trabaja la [API](#pruebas).

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
## Manejo de errores
**CountriesService.java**
```java
  ArrayList<String> arregloContinentes = new ArrayList<>(
      Arrays.asList("africa", "europe", "asia", "north_america", "south_america"));
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

## Buscar por nombre
**CountriesController.java**
```java
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
```
**CountriesService.java**
```java
  @Override
  public Optional<CountryDocument> findCountryByName(String countryName) {
    return countriesRepository.findByName(countryName);
  }
```

---

## Crear documento
**CountriesController.java**
```java
      @PostMapping(path = "/country", consumes = "application/json", produces = "application/json")
      public ResponseEntity<Optional<CountryDocument>> saveCountryByName(@RequestBody CountryDocument document) {
            return new ResponseEntity<Optional<CountryDocument>>(countriesService.saveContinent(document),
                        HttpStatus.CREATED);
      }
```
**CountriesService.java**
```java
  // Se probo con SoapUI alimentando a un JSON para pruebas
  @Override
  public Optional<CountryDocument> saveContinent(CountryDocument document) {
    countriesRepository.save(document);
    return countriesRepository.findById(document.getId());
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

## Puerto
**application.yml**
```yml
server:
  port: 8082
```

---

## Pruebas

**Continente por nombre**
![Continente por nombre](http://g.recordit.co/FPaMB6uznP.gif)
**Crear País**
![Crear País](http://g.recordit.co/TI9IC95flL.gif)
