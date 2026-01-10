package com.ravi.leetcode.slidingWindow;

import java.util.Arrays;

public class DefuseTheBomb {
    static void main() {
        int[] input = {5,7,1,4};
        int[] result = decrypt(input,3);
        System.out.println(Arrays.toString(result));
    }
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= Math.abs(k); j++) {
                    sum += code[(i - j + n) % n];
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
