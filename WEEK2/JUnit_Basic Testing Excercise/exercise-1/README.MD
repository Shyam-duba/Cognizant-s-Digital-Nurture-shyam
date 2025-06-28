# Multiply - JUnit Test Example (JUnit 4 + Maven)

This is a simple Java project that demonstrates how to write and run unit tests using **JUnit 4** and **Maven** inside **IntelliJ IDEA**.

---

## 📁 Project Structure

<pre>SetupJunit/
├── pom.xml
├── src/
│ ├── main/
│ │ └── java/
│ │ └── org/
│ │ └── example/
│ │ └── Multiply.java
│ └── test/
│ └── java/
│ └── org/
│ └── example/
│ └── MultiplyTest.java</pre>


---

## 📦 Multiply.java

This is the class we want to test.

```java
package org.example;

public class Multiply {
    public int multiply(int a, int b) {
        return a * b;
    }
}
```
### we test the multiply() method with 3 diffrent cases

``` java
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplyTest {

    @Test
    public void testMultiplyPositiveNumbers() {
        Multiply m = new Multiply();
        assertEquals(20, m.multiply(4, 5));
    }

    @Test
    public void testMultiplyWithZero() {
        Multiply m = new Multiply();
        assertEquals(0, m.multiply(0, 10));
    }

    @Test
    public void testMultiplyNegative() {
        Multiply m = new Multiply();
        assertEquals(-15, m.multiply(-3, 5));
    }
}```
