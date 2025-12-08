package com.ravi.leetcode.arrays;

import java.util.Arrays;
import java.util.List;

public class MinimumOperationsLeetCode3512 {

    static void main() {
        int[] nums = {3,2,9};
        int result = minOperations(nums,6);
        System.out.println(result);

    }

    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i : nums){
            sum +=i;
        }
        if(sum % k == 0 ){
            return 0;
        }
        int modulo = sum % k;
        return modulo;
    }
}
