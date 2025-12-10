package com.ravi.leetcode.hashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyNumber202 {

    static void main() {
            int num = 2;
            boolean result = isHappy(num);
        System.out.println(result);
    }

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        // Loop until the number becomes 1 (happy) or we detect a cycle
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumOfSquaresOfDigits(n);
        }

        // If n is 1, the loop terminated because it's a happy number.
        // Otherwise, it terminated because it hit a cycle (seen.contains(n) was true).
        return n == 1;
    }

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
