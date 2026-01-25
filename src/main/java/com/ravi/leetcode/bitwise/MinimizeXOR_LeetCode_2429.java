package com.ravi.leetcode.bitwise;

import java.math.BigInteger;
import java.math.BigInteger;

public class MinimizeXOR_LeetCode_2429 {
    static void main() {
        int result = minimizeXor(1,12);
        System.out.println(result);

    }
    // Brute Force
    /*public static int minimizeXor22(int num1, int num2) {
        int bitCountNum2 = BigInteger.valueOf(num2).bitCount();
        while(num1<=num2){
            int bitCountNum1 = BigInteger.valueOf(num1).bitCount();
            if(bitCountNum1==bitCountNum2){
                return num1;
            }else {
                num1++;
            }
        }
        return 0;
    }*/

    public static int minimizeXor(int num1, int num2) {
        int need = Integer.bitCount(num2);
        int have = Integer.bitCount(num1);

        int x = num1;

        // Turn OFF bits if we have too many
        for (int i = 0; i < 32 && have > need; i++) {
            if ((x & (1 << i)) != 0) {
                x ^= (1 << i);
                have--;
            }
        }

        // Turn ON bits if we have too few
        for (int i = 0; i < 32 && have < need; i++) {
            if ((x & (1 << i)) == 0) {
                x |= (1 << i);
                have++;
            }
        }

        return x;
    }
}
