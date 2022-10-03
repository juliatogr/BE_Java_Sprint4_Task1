# BE_Java_Sprint4_Task1

Repository created to deliver the first task of the fourth sprint of the BackEnd Java Bootcamp at IT-Academy.

<p align="center">
<img src=https://user-images.githubusercontent.com/72571435/179958350-c8db27b9-ada1-45d3-8ab4-6f2dcd31eb30.png width="120" height="120" />
</p>

## General description

Aquest exercici t'introduirà al framework SPRING. 

Començaràs a fer servir el protocol HTTP, a usar Postman, i a descobrir com gestionar dependències amb Maven i Gradle.


## Nivell 1 - Spring i Maven

### Statement
Aquest exercici és un primer contacte amb Spring i Maven.

Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:


PROJECT (gestor de dependències)

Maven.

LANGUAGE

Java.

SPRING BOOT

La darrera versió estable.

PROJECT METADATA

Group

cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01

Artifact

S04T01N01GognomsNom

Name

S04T01N01GognomsNom

Description

S04T01N01GognomsNom

Package name

cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01

PACKAGIN

Jar

JAVA

Mínim versió 11 

Dependències:

Spring Boot DevTools

Spring Web


Importa’l a Eclipse amb l’opció File > Import > Existing Maven Project.

A l’arxiu application.properties, configura la variable server.port amb el valor 9000.

Convertirem aquesta aplicació en una API REST:
Depenent del package principal, crea un altre subpackage anomenat Controllers, i dins seu, afegeix la classe HelloWorldController.


Haurà de tenir dos mètodes:
String saluda
String saluda2

Aquests dos mètodes rebran un paràmetre String anomenat nom, i retornaran la frase:

“Hola, “ + nom + “. Estàs executant un projecte Maven”.


El primer mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com un RequestParam. El paràmetre "nom" tindrà el valor per defecte “UNKNOWN”.

Haurà de respondre a:

http://localhost:9000/HelloWorld
http://localhost:9000/HelloWorld?nom=El meu nom

 

El segon mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com una PathVariable. El paràmetre "nom" serà opcional.

Haurà de respondre a:

http://localhost:9000/HelloWorld2
http://localhost:9000/HelloWorld2/el meu nom	

### info
- La classe Undo implementa el patró Singleton. 
- Per veure l'historial de comandes s'ha d'escriure `--history`.
- Per desfer l'última comanda s'ha d'escriure `--undo`.
- `--history` i `--undo` no s'afegeixen en la llista de comandes aplicades. La resta de cadenes si.
- Per sortir s'ha d'escriure `--exit`.


### info

no info yet

## Nivell 2 - Spring i Gradle (Not done)

### Statement
Veuràs que aquest nivell és quasi idèntic al nivell 1, però fent servir Gradle com a Gestor de dependències.

Accedeix a la pàgina ->https://start.spring.io/, i genera un projecte Spring boot amb les següents característiques:

PROJECT (gestor de dependències)

Gradle.

LANGUAGE

Java.

SPRING BOOT

La darrera versió estable.

PROJECT METADATA

Group

cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02

Artifact

S04T01N02GognomsNom

Name

S04T01N02CognomsNom

Description

S04T01N02GognomsNom

Package name

cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n02

PACKAGIN

Jar

JAVA

Mínim versió 11 

Dependències:

Spring Boot DevTools

Spring Web


Importa’l a Eclipse amb l’opció File > Import > Existing Gradle Project.


A l’arxiu application.properties, configura la variable server.port amb el valor 9001.


Convertirem aquesta aplicació en una API REST:
Depenent del package principal, crea un altre subpackage anomenat Controllers, i dins seu, afegeix la classe HelloWorldController.

Haurà de tenir dos mètodes:

String saluda
String saluda2


Aquests dos mètodes rebran un paràmetre String anomenat "nom" i retornaran la frase:

“Hola, “ + nom + “. Estàs executant un projecte Gradle”.

El primer mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com un RequestParam. El paràmetre "nom" tindrà el valor per defecte “UNKNOWN”.

Haurà de respondre a:

http://localhost:9001/HelloWorld
http://localhost:9001/HelloWorld?nom=El meu nom
 

El segon mètode respondrà a una petició GET, i haurà de ser configurat per a rebre el paràmetre com una PathVariable. El paràmetre "nom" serà opcional.

Haurà de respondre a:

http://localhost:9001/HelloWorld2
http://localhost:9001/HelloWorld2/el meu nom

### info

no info yet


## Nivell 3 - Postman (Not done)

### statement

Es tracta de provar els anteriors projectes des de Postman.

Crea dos entorns:

-          Projecte Maven

-          Projecte Gradle

 

Ambdós entorns tindran dues variables:

-          Servidor, que en els dos casos tindrà el valor http://localhost

-          Port, que en el cas del projecte Maven tindrà el valor 9000, i en el cas del projecte Gradle, 9001.

 

Que has d’entregar? (4 arxius):

-          Els dos entorns exportats.

-          Una captura de pantalla per cada entorn, on es vegi l’execució des de Postman usant l’entorn i les variables definides en ells.

-          Pots provar l'URL: http://localhost:xxxx/HelloWorld/elmeunom, o qualsevol altra de les que admeten els dos projectes. (recorda que perquè l’execució funcioni correctament, hauràs de tenir en execució els dos projectes a Eclipse).

Executa des d’Eclipse els projectes creats als dos nivells anteriors, i mostra el retorn obtingut en cada projecte, quan crides a algunes de les peticions disponibles, fent servir els entorns creats i les seves variables.

Hauràs d’entregar dues captures de pantalla, una per l’execució de cada entorn, i dos arxius amb format JSON, amb els entorns exportats.


### info

no info yet

## Util_links

The next links helped me a lot to finish this task.

- *Spring boot change port:* https://www.baeldung.com/spring-boot-change-port

- *Spring Tools 4: Getting Started in Eclipse:* https://www.youtube.com/watch?v=mST9AG4Yn_A

- *Java Microservices: Code Examples, Tutorials and More:* https://dzone.com/articles/java-microservices-code-examples-tutorials-and-more

- *Web Server failed to Start:* https://stackoverflow.com/questions/56499928/web-server-failed-to-start-port-8080-was-already-in-use-spring-boot-microservi

- *Cómo Crear un API REST en Spring Boot:* https://www.youtube.com/watch?v=NSf32d26OL4&t=4s

- *@RequestParam, Spring MVC y sus opciones:* https://www.arquitecturajava.com/requestparam-spring-mvc-y-sus-opciones/

- *Spring Optional Path Variables:* https://www.baeldung.com/spring-optional-path-variables