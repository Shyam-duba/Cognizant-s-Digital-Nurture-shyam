# JUnit Assertions Example - `AssertionsTest.java`

This project demonstrates how to use various **JUnit 4** assertion methods to test logic in Java.



##  Project Structure

<pre>src/
└── test/
└── java/
└── com/
└── example/
└── AssertionsTest.java</pre>



##  Code: AssertionsTest.java

```java
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {
    @Test
    public void testAssertions() {
        assertEquals(56, 28 + 28);                           // Check equality
        assertFalse(3 > 5);                                  // Check condition is false
        assertTrue(3 < 5);                                   // Check condition is true
        assertNull(null);                                   // Check that value is null
        assertNotNull(new Object());                        // Check that value is not null
        assertArrayEquals(new int[]{4, 5, 6}, new int[]{4, 5, 6}); // Check arrays are equal
    }
}
```
🧪 JUnit Assertion Methods Explained

assertEquals(expected, actual)	: Passes if expected value equals actual value

assertFalse(condition)	: Passes if condition is false

assertTrue(condition)	: Passes if condition is true

assertNull(object)	: Passes if object is null

assertNotNull(object)	: Passes if object is not null

assertArrayEquals(expected, actual)	: Passes if both arrays are equal in length & content
