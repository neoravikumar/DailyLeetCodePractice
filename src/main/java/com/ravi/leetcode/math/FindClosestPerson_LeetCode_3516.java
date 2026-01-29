package com.ravi.leetcode.math;

public class FindClosestPerson_LeetCode_3516 {
    static void main() {
        int result = findClosest(2,7,4);
        System.out.println(result);
    }
    public static int findClosest(int x, int y, int z) {
        int one = Math.abs(z-x);
        int two = Math.abs(y-z);
        if(one == two){
            return 0;
        }
        if(one>two){
            return 2;
        }
        return 1;

    }
}
