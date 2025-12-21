package com.ravi.leetcode.bitwise;

// 258. Add Digits
//https://leetcode.com/problems/add-digits/description/
public class AddDigits {
    static void main() {
        int result = addDigits(877);
        System.out.println(result);
    }
    public static int addDigits(int num) {
        return num == 0 ? 0 : 1 + ( num -1 ) % 9;
    }
}

