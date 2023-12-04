# spring-boot-3-scratch-project-with-jwt v2
My sample Java 17 & Spring Boot 3 project with JWT auth (for building apps from scratch)

<h2>2023</h2>

Compared to https://github.com/jovanapetrovic/spring-boot-scratch-project-with-jwt, 
this project has updated versions of:
  - Java (11 to 17)
  - Spring Boot (2.5.3 to 3.2.0)
  - JWT token (io.jswonwebtoken 0.12.3)
  - Spring Security setup
  - Swagger 3 (org.springdoc 2.3.0)

<h2>STARTING THE APP</h2>

The app is using Java version 17.

One way to run the application is through some IDE (I use IntelliJ), by running the Scratchappv2Application.java class (by clicking "Run").
Another way is to run the following commands to start the backend application within the scratchappv2 folder:

<ol>
<li>mvn clean install</li>
<li>mvn spring-boot:run</li>
</ol>

<h2>SWAGGER</h2>

Once the app is started, Swagger API can be accessed here:
<ul>
<li>http://localhost:8080/v3/api-docs</li>
<li>http://localhost:8080/swagger-ui/index.html</li>
</ul>
