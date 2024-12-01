package org.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    public void testAdd() {
        StringCalculator simpleCalculator = new StringCalculator();
        assertEquals(0, simpleCalculator.add(""));
        assertEquals(1, simpleCalculator.add("1"));
        assertEquals(2, simpleCalculator.add("2"));
    }
    @Test
    public void testAddMultipleNumbers() {
        StringCalculator simpleCalculator = new StringCalculator();
        assertEquals(3, simpleCalculator.add("1,2"));
        assertEquals(200, simpleCalculator.add("50,150"));
        assertEquals(200, simpleCalculator.add("50,120,30"));
    }
}