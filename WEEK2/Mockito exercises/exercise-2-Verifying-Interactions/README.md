#  Mockito – Verifying Method Interactions

This example shows how to use **Mockito** to verify that a method was called with specific arguments.

---

##  Use Case

You want to:
- Confirm that a certain method was called
- Ensure it was called with the correct input

---

##  Class Summary

### `ExternalApi.java`

```java
public interface ExternalApi {
    String getData();
}
```

MyService.java
```java

public class MyService {
    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}
```

MyServiceTest.java (JUnit + Mockito)
```java
@Test
public void testVerifyInteraction() {
    ExternalApi mockApi = mock(ExternalApi.class); // Step 1: mock
    MyService service = new MyService(mockApi);    // Step 2: use mock
    service.fetchData();
    verify(mockApi).getData();                     // Step 3: verify method call
}
```
 Output
If the method getData() is called, the test passes.

If it is not called, you get an error like:

Wanted but not invoked:
mockApi.getData();

