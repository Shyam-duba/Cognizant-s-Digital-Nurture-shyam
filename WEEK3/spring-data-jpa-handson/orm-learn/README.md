#  Spring Data JPA + Hibernate + MySQL Example

This project demonstrates how to use **Spring Data JPA** with **Hibernate** as the JPA provider and **MySQL** as the database. It follows a simple `Country` entity to show how data can be persisted and retrieved with minimal boilerplate.

---



##  Setup

1. Go to [https://start.spring.io](https://start.spring.io)
2. Project details:
    - Group: `com.cognizant`
    - Artifact: `orm-learn`
    - Dependencies: **Spring Boot DevTools**, **Spring Data JPA**, **MySQL Driver**
3. Import into Eclipse as a Maven project.
4. Create a schema in MySQL:
   ```sql
   CREATE SCHEMA ormlearn;

## DataBase Table

```roomsql
CREATE TABLE country (
  co_code VARCHAR(2) PRIMARY KEY,
  co_name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States of America');
```
## Layers in the App
1. model.Country: Entity class with @Entity, @Table, @Id, and @Column

2. repository.CountryRepository: Interface extending JpaRepository

3. service.CountryService: Calls countryRepository.findAll() to fetch data

4. OrmLearnApplication: Runs test to retrieve and log all countries
