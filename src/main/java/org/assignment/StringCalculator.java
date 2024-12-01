package org.assignment;

import java.util.Arrays;

public class StringCalculator {
    public int add(String numbers) {
        int lengthOfNumbers = numbers.length();
        if (lengthOfNumbers < 2) {
            if (numbers.isEmpty()) {
                return 0;
            } else {
                return Integer.parseInt(numbers);
            }
        } else {
            return Arrays.stream(numbers.split(",")).mapToInt(num -> Integer.parseInt(num)).sum();
        }
    }
}
