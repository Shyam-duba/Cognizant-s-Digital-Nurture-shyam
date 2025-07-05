#  Difference Between JPA, Hibernate, and Spring Data JPA

##  Java Persistence API (JPA)
- **JPA** is a **specification (JSR 338)** for persisting, reading, and managing data between Java objects and relational databases.
- It is a **set of interfaces and annotations**, not a concrete implementation.
- Think of it as a **contract** that defines how ORM frameworks should behave.

---

##  Hibernate
- It's a **full-featured ORM (Object Relational Mapping) framework**.
- Supports additional features beyond JPA like:
    - Caching
    - Native SQL support
    - Batch processing
- Hibernate allows you to **map Java classes to database tables** using annotations or XML.

---

##  Spring Data JPA
- Spring Data JPA is **not a JPA implementation**.
- It is a **Spring project that simplifies JPA-based data access**.
- Provides a higher-level abstraction over standard JPA by:
    - Reducing boilerplate code (e.g., no need to write most `DAO`/`Repository` classes).
    - Allowing auto-generated queries using method names.


---

##  Implementation output

