package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class MultiplyTest {
    @Test
    public void testMultiplyPositiveNumbers(){
        Multiply m = new Multiply();
        assertEquals(20, m.product(4,5));
    }

    @Test
    public void testMultiplyWithZero() {
        Multiply m = new Multiply();
        assertEquals(0, m.product(0, 10));
    }

    @Test
    public void testMultiplyNegative() {
        Multiply m = new Multiply();
        assertEquals(-15, m.product(-3, 5));
    }
}
