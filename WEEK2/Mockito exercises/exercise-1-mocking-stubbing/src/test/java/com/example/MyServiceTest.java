package com.example;

import org.example.ExternalApi;
import org.example.MyService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class MyServiceTest {
    @Test
    public void testExternalApi(){
        // step 1 : Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // step 2 : Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // step 3 : Inject mock and test
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        assertEquals("Mock Data", result);
    }
}
