package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    void sumIsCorrect() {
        assertEquals(35, c.sum(10, 25));
    }

    @Test
    void diffIsCorrect() {
        assertEquals(-15, c.diff(10, 25));
    }

    @Test
    void productIsCorrect() {
        assertEquals(250, c.product(10, 25));
    }

    @Test
    void averageIsCorrect() {
        assertEquals(17.5, c.average(10, 25));
    }

    @Test
    void evenNumberIsEven() {
        assertTrue(c.isEven(4));
    }

    @Test
    void oddNumberIsNotEven() {
        assertFalse(c.isEven(7));
    }
}
