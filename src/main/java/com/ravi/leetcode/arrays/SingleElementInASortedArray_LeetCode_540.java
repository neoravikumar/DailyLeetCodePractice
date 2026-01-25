package com.ravi.leetcode.arrays;

import java.util.Arrays;

public class SingleElementInASortedArray_LeetCode_540 {
    static void main() {
        // int[] input = {1,1,2,2,3,3,4,4,8,8};
        // int[] input = {2,2,3,3,7,7,10,10,11,11};
        int[] input = {2,2,3,2};
        int result = singleNonDuplicate(input);
    }
    public static int singleNonDuplicate(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int k:nums){
            result ^= k;
        }
        System.out.println("R>>"+result);
        return result;
    }
}
