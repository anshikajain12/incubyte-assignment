package org.assignment;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(numbers);
        }
    }
}
