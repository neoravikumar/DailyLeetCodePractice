package com.ravi.leetcode.math;

public class SqrtWithoutMath {
    public int mySqrt(int x) {
        if (x < 2)
            return x;

        double y = x;
        double z = (y + (x / y)) / 2;

        while (Math.abs(y - z) >= 0.00001) {
            y = z;
            z = (y + (x / y)) / 2;
        }
        return (int) z;
    }
}
