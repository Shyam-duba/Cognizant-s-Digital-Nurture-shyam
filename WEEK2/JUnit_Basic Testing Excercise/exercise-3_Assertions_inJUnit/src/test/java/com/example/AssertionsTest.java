package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
public class AssertionsTest {
    @Test
    public void testAssertions(){
        assertEquals(56, 28+28);

        assertFalse(3 > 5);

        assertTrue(3 < 5);

        assertNull(null);

        assertNotNull(new Object());

        assertArrayEquals(new int[]{4,5,6},new int[]{4,5,6});

    }
}
