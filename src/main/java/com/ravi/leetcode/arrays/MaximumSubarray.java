package com.ravi.leetcode.arrays;

public class MaximumSubarray {

    static void main() {
        //int[] nums = {2,4,6,8};
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maximumSubArraySum(nums);
        System.out.println(result);
    }

    // Brute Force Approach
    /*public static int maximumSubArraySum(int[] nums){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }*/

    // Optimal Approach
    public static int maximumSubArraySum(int[] nums){
        int max = nums[0];
        int groupMax = nums[0];
        int n = nums.length;
        for(int k=1;k<n;k++){
            max = Math.max(nums[k], max+nums[k]);
            groupMax = Math.max(groupMax, max);
        }
        return groupMax;
    }
}
