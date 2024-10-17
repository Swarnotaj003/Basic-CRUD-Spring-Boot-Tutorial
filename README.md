# Basic CRUD Application : Spring Boot Tutorial

## Tech Stack
- `Programming Language`:  Java
- `Web Technologies`:  JSP (Jakarta Server Pages)
- `Frameworks`:  Spring Boot, Spring Data JPA
- `Persistence Technologies`:  JDBC, JPA (Java Persistence API), Hibernate
- `Database`:  MySQL

## Features
- Search students
- Add students
- Remove students

## Executing the Project
### Step-1 : IDE Setup
Install `Eclipse IDE` with `Spring Tool Suite(STS)` plugin

### Step-2 : Clone the Repo
Use the following command to clone this repository
```
git clone https://github.com/Swarnotaj003/Basic-CRUD-Spring-Boot-Tutorial.git
```

### Step-3 : Local Database Setup
Update the username, password and any other relevant details as per your local MySQL database in the [`application.properties`](src/main/resources/application.properties)
```
# Database connection settings
spring.datasource.url=jdbc:mysql://localhost:3306/crud_students
spring.datasource.username=
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

Run the following MySQL commands to create an empty database `crud_students`
```
DROP DATABASE IF EXISTS crud_students;
CREATE DATABASE crud_students;
```

### Step-4 : Access the Web Page
Open your browser and enter the following url
```
http://localhost:8080/student
```

## Spring Boot Theory
### What is Spring Boot?
Spring Boot is an open-source Java framework used to create a Micro Service. Spring boot is developed by Pivotal Team, and it provides a faster way to set up and an easier, configure, and run both simple and web-based applications. It is a combination of Spring Framework and Embedded Servers. The main goal of Spring Boot is to reduce development, unit test, and integration test time and in Spring Boot, there is no requirement for XML configuration.

### Architecture
![image](https://github.com/user-attachments/assets/a1252117-de64-4090-9d7f-54b8a03d1734)

1. `Presentation Layer` - The presentation layer is the top layer of the spring boot architecture. It consists of Views. i.e., the front-end part of the application. It handles the HTTP requests and performs authentication. It is responsible for converting the JSON field’s parameter to Java Objects and vice-versa. Once it performs the authentication of the request it passes it to the next layer. i.e., the business layer.
2. `Business Layer` - The business layer contains all the business logic. It consists of services classes. It is responsible for validation and authorization.
3. `Persistence Layer` - The persistence layer contains all the database storage logic. It is responsible for converting business objects to the database row and vice-versa.
4. `Database Layer` - The database layer contains all the databases such as MySql, MongoDB, etc. This layer can contain multiple databases. It is responsible for performing the CRUD operations.
