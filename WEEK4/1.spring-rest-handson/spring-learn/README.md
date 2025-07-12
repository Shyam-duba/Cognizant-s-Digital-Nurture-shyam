SME Walkthrough:
1. src/main/java 
   Purpose: This is where the main application logic and source code go.


com.cognizant.springlearn.SpringLearnApplication → the main class

Further sub-packages like controller, service, repository, etc.

2. src/main/resources 
   Contains configuration files:

application.properties or application.yml: For environment settings (e.g., server port, DB configs)

Static and template files (if using Thymeleaf or static web assets)

3. src/test/java 
   This is for unit and integration tests.

4. SpringApplication.java:
   The main() method acts as the entry point.
   SpringApplication.run(...) starts the embedded Tomcat server and initializes Spring context.

5. @SpringBootApplication annotation:
   this annotation is equivalent as using all below annotations together
   @Configuration: Marks this class as a source of bean definitions.

   @EnableAutoConfiguration: Auto-configures Spring Boot application based on classpath.

   @ComponentScan: Scans sub-packages for @Component, @Service, @Controller, etc.
6. pom.xml:
   the pom.xml is the maven built configuration
   1. configurations:
   2. Dependency Hierarchy:
      
   