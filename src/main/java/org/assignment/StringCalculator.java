package org.assignment;

public class StringCalculator {

    private static final String DEFAULT_DELIMITER = ",|\n";

    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) return 0;
        String delimeter = DEFAULT_DELIMITER;
        if (numbers.matches("//(.*)\n(.*)")) {
            delimeter = Character.toString(numbers.charAt(2));
            if(!delimeter.equals(";")) throw new IllegalArgumentException("Invalid Test");
            numbers = numbers.substring(4);
        }

        String[] splitNumbers = splitNumbers(numbers, delimeter);
        return sum(splitNumbers);
    }

    private String[] splitNumbers(String numbers, String delimiter) {
        return numbers.split(delimiter);
    }

    private int sum(String[] numbers) {
        int total = 0;
        StringBuilder negativeString = new StringBuilder();
        for (String num : numbers) {
            int number = Integer.parseInt(num);
            //collect negativeNumbers
            if (number < 0) {
                if (negativeString.length() > 0) {
                    negativeString.append(",");
                }
                negativeString.append(num);
            }
            //add numbers less than 1000
            if (number < 1000) {
                total += number;
            }
        }
        //exceptions if negative numers are present
        if (negativeString.length() > 0) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeString);
        }
        return total;
    }
}
