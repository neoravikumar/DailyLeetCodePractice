package com.ravi.leetcode.twoPointer;

public class StrictlyPalindromicNumber {
    static void main() {
        boolean result = isStrictlyPalindromic(3);
        System.out.println(result);
    }
    public static boolean isStrictlyPalindromic(int n) {
        // Check every base from 2 to n-2
        for (int k = 2; k <= n - 2; k++) {
            String sString = Integer.toString(n, k);
            if (!isPalindrome(sString)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
