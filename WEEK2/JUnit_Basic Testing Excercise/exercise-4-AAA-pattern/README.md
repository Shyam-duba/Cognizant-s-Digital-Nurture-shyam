# ✅ JUnit 4 - Arrange-Act-Assert Pattern with Setup and Teardown

This example demonstrates how to write clean and maintainable tests in **JUnit 4** using the **AAA (Arrange-Act-Assert)** pattern, and use `@Before` and `@After` methods for test setup and teardown.

---

## 🔢 What’s Covered

- ✅ Writing structured tests using AAA pattern
- ✅ Using `@Before` for setup (runs before each test)
- ✅ Using `@After` for teardown (runs after each test)

---

## 📄 Class Under Test

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        int mul = a * b;

        return mul;
    }

    public int division(int a, int b){
        int div = a /b;

        return div;
    }
}
```
| Step    | Purpose                         |
| ------- | ------------------------------- |
| Arrange | Prepare inputs and dependencies |
| Act     | Call the method under test      |
| Assert  | Verify the result               |




