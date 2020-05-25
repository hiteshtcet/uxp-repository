# LTI-Banking-Application

Technology stack used:

```
Spring Boot
Spring Data JPA
Spring Security
Hibernate
MySQL
REST
HTML5.0
CSS3.0
JQUERY
Bootstrap
```

The project simulates banking system. It allows to register/login, deposit/withdraw money from accounts, add/edit recipients, transfer money between accounts and recipients and view transactions.

There are two roles user and admin.

## Things to run the application

__Clone the repository__

```
git clone https://github.com/hitesh0003/LTI 
```

__Go the folder__

```
LTI-Banking-Application
```

__Set Your MySQL username & password in application.properties__

[application.properties](../../src/main/resources/application.properties)

__Run the application__

```
mvn clean spring-boot:run
```

Access the application by clicking the URL "[http://localhost:8080](http://localhost:8080)"

## Deployment Steps:
###### Build application
```
mvn clean build
```
###### DB Setup
 * Start [MySQL server!](https://dev.mysql.com/downloads/mysql/)
 * Use [MySQLWorkbench!](https://www.mysql.com/products/workbench/)

###### Run application
```
java -jar target/banking-0.0.1-SNAPSHOT.jar
```