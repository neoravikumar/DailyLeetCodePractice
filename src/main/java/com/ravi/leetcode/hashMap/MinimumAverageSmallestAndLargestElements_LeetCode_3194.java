package com.ravi.leetcode.hashMap;

import java.util.Arrays;

public class MinimumAverageSmallestAndLargestElements_LeetCode_3194 {
    static void main() {

        double result = minimumAverage(new int[]{7,8,3,4,15,13,4,1});
        System.out.println(result);

    }
    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int start = 0;
        int end = n-1;
        double result = Integer.MAX_VALUE;
        for(;start<end;start++,end--){
            double avg = (nums[start]+nums[end])/2.0;
            result = Math.min(result, avg);
        }
        return result;
    }
}
