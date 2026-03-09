package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayStatsTest {

    ArrayStats s = new ArrayStats();

    @Test
    void maxFindsLargest() {
        assertEquals(9, s.max(new int[]{3, 1, 9, 4}));
    }

    @Test
    void minFindsSmallest() {
        assertEquals(1, s.min(new int[]{3, 1, 9, 4}));
    }

    @Test
    void meanIsCorrect() {
        assertEquals(2.5, s.mean(new int[]{1, 2, 3, 4}));
    }

    @Test
    void singleElementMax() {
        assertEquals(5, s.max(new int[]{5}));
    }

    @Test
    void negativeValuesMin() {
        assertEquals(-7, s.min(new int[]{-7, -1, 0}));
    }

    @Test
    void meanWithNegativeValues() {
        assertEquals(-2.0, s.mean(new int[]{-4, -2, 0, -2}));
    }
}
