## Ejercicio de una API alimentada con MongoDB 🚀

Se realizó los siguientes cambios: 😎
1. Cambiar en el Controlador y el servicio la palabra [Country a CountryDocument](#country-a-countrydocument)
2. Para el TomCat configuré el puerto a 8082
3. En el modelo, agregue las [columnas](#columnas) de la BD de MongoDB para que reconozca hacia donde debe de llenar

---

<img src="https://geeksjavamexico.files.wordpress.com/2017/09/spring-framework.png?w=640" title="Spring" alt="Spring" height="50%" width="50%">

---

## Country a CountryDocument
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

![Recordit GIF](http://g.recordit.co/iLN6A0vSD8.gif)
