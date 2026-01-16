package com.ravi.leetcode.math;

public class SumOfAllSubsetXORTotals_LeetCode_1863 {
    static void main() {
        int[] input = {5,1,6};
        int result = subsetXORSum(input);
        System.out.println(result);

    }
    public static int subsetXORSum(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int numSubsets = 1 << n;
        for (int i = 0; i < numSubsets; i++) {
            int currentXOR = 0;
            for (int j = 0; j < n; j++) {
                if ((i >> j & 1) == 1) {
                    currentXOR ^= nums[j];
                }
            }
            totalSum += currentXOR;
        }
        return totalSum;
    }
}
