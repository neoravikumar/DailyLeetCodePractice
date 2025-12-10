package com.ravi;

public class Utils {

    // Helper method to calculate the sum of squares of digits inline
    private static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
