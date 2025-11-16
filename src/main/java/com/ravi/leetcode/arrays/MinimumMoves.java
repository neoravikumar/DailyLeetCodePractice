package com.ravi.leetcode.arrays;

import java.util.Arrays;

public class MinimumMoves {

    public static void main(String[] args) {

        int[] arr = {4,4,5};
        int result = minMoves(arr);
        System.out.println(result);

    }
    public static  int minMoves(int[] nums) {
        Arrays.sort(nums);

        int lastE = nums[nums.length-1];
        int result = 0;
        for(int i=0;i<nums.length-1;i++){
            int diff = lastE - nums[i];
            result +=diff;
        }
        return result;
    }
}
