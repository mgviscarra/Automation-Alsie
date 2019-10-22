# Automation-Alsie

A Test Spring Boot application that uses Spring MVC Controllers and is unit tested, integration tested and UI tested.


## Build, Run and Test the app

* To build `./gradlew build -x test`.
* To run the web application, run `./gradlew bootRun`. Open web browser to:
  * http://localhost:8080 -- view a basic intro page
  * http://localhost:8080/students/list -- to view JSON list of users
  * http://localhost:8080/students/Steve -- to view JSON for a specific user
* To run the tests execute: `./gradlew test`


## Dependencies
All dependencies are managed in the `build.gradle` file, there you need to change your chrome driver path for UI tests.
  
## Explanation of Code

This is a Spring Boot application.
AppBootMain contains the main function that builds the application as a Spring Boot web app.

The `domain_model` package has a simple POJO class that gets returned by the Controller.

The `data_repository` package has a simple Repository class and interface representing a data store. The concreate class just contains a static list of objects. The interface exists so the dependency can be mocked using Mockito.

The `web_controllers` package contains Spring MVC Controllers that map REST URIs to methods that return objects.

View the `test` package to see the different implemented tests.


