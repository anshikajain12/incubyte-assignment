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
            String delimeter=",";
            String[] splitNumbers = splitNumber(numbers,delimeter + "|\n");
            return Arrays.stream(splitNumbers).mapToInt(num -> Integer.parseInt(num)).sum();
        }
    }

    private String[] splitNumber(String numbers, String delimeter) {
        return numbers.split(delimeter);
    }
}
