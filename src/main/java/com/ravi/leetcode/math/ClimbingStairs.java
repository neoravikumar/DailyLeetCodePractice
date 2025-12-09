package com.ravi.leetcode.math;

public class ClimbingStairs {

    static void main() {
        int result = climbStairs(3);
        System.out.println(result);
    }

    public static int climbStairs(int n) {

        if(n == 0 || n == 1 ) {
            return 1;
        }
        int prev =1, current =1;
        for(int i=2;i<=n;i++){
            int temp = current;
            current= prev+current;
            prev = temp;
        }
        return current;
    }
}
