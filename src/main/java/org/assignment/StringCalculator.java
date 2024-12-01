package org.assignment;


public class StringCalculator {
    public int add(String numbers) {
        int lengthOfNumbers = numbers.length();
        if (lengthOfNumbers < 2) {
            int num = (numbers.isEmpty()) ? 0 : Integer.parseInt(numbers);
            return num;

        } else {
            String delimeter = ",";
            if (numbers.matches("//(.*)\n(.*)")) {
                delimeter = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
            }
            String[] splitNumbers = splitNumber(numbers, delimeter + "|\n");
            return sum(splitNumbers);
        }
    }

    private String[] splitNumber(String numbers, String delimeter) {
        return numbers.split(delimeter);
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
