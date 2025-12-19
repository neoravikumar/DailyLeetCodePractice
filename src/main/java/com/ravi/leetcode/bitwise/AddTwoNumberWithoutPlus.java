package com.ravi.leetcode.bitwise;

// https://leetcode.com/problems/sum-of-two-integers/description/
// 371. Sum of Two Integers
/*
Given two integers a and b, return the sum of the two integers without using the operators + and -.

Example 1:

Input: a = 1, b = 2
Output: 3
Example 2:

Input: a = 2, b = 3
Output: 5

Constraints:
-1000 <= a, b <= 1000
 */

public class AddTwoNumberWithoutPlus {

    static void main() {

        int result = sum(5, 4);
        System.out.println(result);

    }
    public static int sum(int a, int b) {
        // Loop until there are no more carries (b becomes 0)
        while (b != 0) {
            // Calculate the carry: common set bits of a and b
            int carry = (a & b) << 1;

            // Calculate the sum without considering the carry: bits of a and b where at least one is set
            a = a ^ b;

            // Update b to the carry, so the process repeats for the carry
            b = carry;
        }

        // When the loop finishes, a holds the final sum
        return a;
    }
}
