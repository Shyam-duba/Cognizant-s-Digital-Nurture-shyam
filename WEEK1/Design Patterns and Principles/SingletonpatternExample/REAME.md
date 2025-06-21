# SingletonPatternExample

## Overview
This Java project demonstrates the **Singleton Design Pattern** using a `Logger` utility class. The goal is to ensure that only one instance of the `Logger` class exists throughout the application lifecycle to maintain consistent logging behavior.

---

## Project Structure

<perv>SingletonPatternExample/
├── Logger.java
├── Test.java
└── Main.java
└── README.md</perv>


---

## Design Pattern Used

### Singleton Pattern
- Ensures a class has only **one instance** and provides a global point of access to it.
- Useful when exactly one object is needed to coordinate actions across the system (e.g., logging, configuration managers, thread pools).

---

## Logger.java

This class:
- Has a **private static instance** of itself.
- Uses a **private constructor** to prevent direct instantiation.
- Provides a **public static method `getInstance()`** to access the single instance.

```java
public class Logger {
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Public method to provide access to the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

  
}
