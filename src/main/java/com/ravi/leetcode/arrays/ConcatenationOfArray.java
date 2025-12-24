package com.ravi.leetcode.arrays;

public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for(int i=0,j=0;i<2*n && j<n;i++,j++){
            ans[i]=nums[j];
            ans[n+i]=nums[j];
        }

        return ans;
    }
}
