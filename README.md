# SpringBoot-CRUD-App

Spring Boot CRUD Web application using Spring Boot, ThymeLeaf, Spring Data JPA, Hibernate, MySQL database

## Features
- Get all the employees
- Add a new employee
- Update an employee
- Delete an employee

## Technologies used
- Spring Boot 2.7.5
- Spring Framework
- Maven
- Java 11
- Spring Data JPA (Hibernate)
- Thymeleaf

## Dependencies
- Spring web
- Spring Data JPA
- Thymeleaf
- MySQL Driver
- Spring Boot DevTools
```maven
  <dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
  
  ```
  
  ## Front End
  Thymeleaf template is used
  
  ### Home page
  ![snippet1](https://user-images.githubusercontent.com/111524304/201858024-c5dd5631-6fc7-4581-9271-3141ab384cea.PNG)
  
  ### Add Employee
  ![snippet2](https://user-images.githubusercontent.com/111524304/201858168-f65468cc-ecb8-4332-ba5a-6798e03a433c.PNG)
  
  ### Update Employee
  ![snippet3](https://user-images.githubusercontent.com/111524304/201858337-a54e8d05-6682-4353-b015-2736df95521c.PNG)
  
  ## Database
  `MySQL`
  
  ## Backend
  `Spring boot`
  


