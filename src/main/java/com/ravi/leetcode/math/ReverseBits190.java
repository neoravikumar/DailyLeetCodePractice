package com.ravi.leetcode.math;

public class ReverseBits190 {

    public static int reverseBits(int n) {
        int reversedN = Integer.reverse(n);
        return reversedN;
    }

    static void main() {
        int result = reverseBits(43261596);
        System.out.println(result);
    }
}
