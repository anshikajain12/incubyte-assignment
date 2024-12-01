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
    @Test
    public void testNewLine(){
        StringCalculator simpleCalculator = new StringCalculator();
        assertEquals(10, simpleCalculator.add("1\n2,3\n4"));
        assertEquals(1, simpleCalculator.add("1,\n"));
    }
    @Test
    public void testNegativeNumber() {
        StringCalculator simpleCalculator = new StringCalculator();
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
        StringCalculator simpleCalculator = new StringCalculator();
        assertEquals(10, simpleCalculator.add("1000,10"));
    }
    @Test
    public void testOtherDelimiter() {
        StringCalculator simpleCalculator = new StringCalculator();
        assertEquals(3, simpleCalculator.add("//;\n1;2"));
    }
}