package com.example;

import org.example.Calculate;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;


import static org.junit.Assert.*;

public class CalculateTest {
    private Calculate calculator;

    // 🔧 Setup method - runs before each test
    @Before
    public void setUp() {
        calculator = new Calculate();
        System.out.println("Before each test: Calculator created");
    }

    // 🧹 Teardown method - runs after each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("After each test: Calculator set to null");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 4;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(6, result);
    }
    @Test
    public void testMultiply(){
        int a = 10;
        int b = 4;

        int result = calculator.multiply(a, b);

        assertEquals(40, result);
    }

    @Test
    public void testDivision(){
        int a = 10;
        int b = 2;

        int result = calculator.division(10, 2);

        assertEquals(a/b, result);
    }
}
