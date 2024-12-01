package org.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    StringCalculator simpleCalculator = new StringCalculator();

    @Test
    public void testNull() {
        assertEquals(0, simpleCalculator.add(null));
    }

    @Test
    public void testEmptyString() {
        assertEquals(0, simpleCalculator.add(""));
    }

    @Test
    public void testAddOneNumber() {
        assertEquals(1, simpleCalculator.add("1"));
        assertEquals(2, simpleCalculator.add("2"));
    }

    @Test
    public void testAddMultipleNumbers() {
        assertEquals(3, simpleCalculator.add("1,2"));
        assertEquals(200, simpleCalculator.add("50,150"));
        assertEquals(200, simpleCalculator.add("50,120,30"));
    }

    @Test
    public void testNewLine() {
        assertEquals(10, simpleCalculator.add("1\n2,3\n4"));
        assertEquals(1, simpleCalculator.add("1,\n"));
    }

    @Test
    public void testNegativeNumber() {
        try {
            simpleCalculator.add("-1,2");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Negatives not allowed: -1");
        }
        try {
            simpleCalculator.add("1,-2,3,-5");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Negatives not allowed: -2,-5");
        }
    }

    @Test
    public void testOverThousand() {
        assertEquals(10, simpleCalculator.add("1000,10"));
    }

    @Test
    public void testOtherDelimiter() {
        assertEquals(3, simpleCalculator.add("//;\n1;2"));
        try {
            simpleCalculator.add("//1;2\n3");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Invalid Test");
        }
    }
}