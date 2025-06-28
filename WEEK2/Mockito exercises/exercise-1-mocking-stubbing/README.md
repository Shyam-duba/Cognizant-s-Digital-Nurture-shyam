# 🔍 Mockito Mocking Example – External API Service

This project demonstrates how to use **Mockito** in **JUnit 5** to test a service class that depends on an external API.

---

## 🧪 What You'll Learn

- ✅ How to create a mock using `Mockito.mock()`
- ✅ How to stub method calls using `when(...).thenReturn(...)`
- ✅ How to inject the mock into your service
- ✅ How to verify the output using `assertEquals`

---

## 📄 Class Summary

### ExternalApi.java

```java
public interface ExternalApi {
    String getData();
}
MyService.java
java
Copy
Edit
public class MyService {
    private ExternalApi externalApi;
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}```

MyServiceTest.java

@Test
```public void testExternalApi() {
    ExternalApi mockApi = mock(ExternalApi.class); // Create mock
    when(mockApi.getData()).thenReturn("Mock Data"); // Stub method

    MyService service = new MyService(mockApi); // Inject mock
    String result = service.fetchData(); // Call method

    assertEquals("Mock Data", result); // Verify result
}```

Tests run: 1, Failures: 0, Errors: 0
BUILD SUCCESS
📦 Dependencies Used
JUnit 5 – for writing unit tests

Mockito – for mocking and stubbing

🔁 Use Case
This pattern is commonly used when:

Testing services that call external APIs

You want to isolate business logic and mock external systems

You need consistent test output without real API calls