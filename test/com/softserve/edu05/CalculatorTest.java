package com.softserve.edu05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add() {
        assertEquals(4, Calculator.add(2, 2));
        assertEquals(-1, Calculator.add(-2, 1));
        assertEquals(0, Calculator.add(0, 0));
    }

    @Test
    public void subtract() {
        assertEquals(0, Calculator.subtract(2, 2));
        assertEquals(-3, Calculator.subtract(-2, 1));
        assertEquals(0, Calculator.subtract(0, 0));
    }

    @Test
    public void multiply() {
        assertEquals(4, Calculator.multiply(2, 2));
        assertEquals(-2, Calculator.multiply(-1, 2));
        assertEquals(0, Calculator.multiply(0, 0));
    }

    @Test
    public void divide() {
        assertEquals(2, Calculator.divide(4, 2));
        assertEquals(-1, Calculator.divide(2, -2));
        assertEquals(0, Calculator.divide(0, 2));

        // division by zero
        try {
            Calculator.divide(4, 0);
            fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            // Expected exception
        }
    }
}