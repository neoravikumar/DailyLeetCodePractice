package com.ravi.leetcode.bitwise;

public class FindTheDifference {
    static void main() {
        char result = findTheDifference("abcd", "abcde");
        System.out.println(result);

    }
    public static char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c;
        }
        for (char c : t.toCharArray()) {
            result ^= c;
        }
        return result;
    }
}
