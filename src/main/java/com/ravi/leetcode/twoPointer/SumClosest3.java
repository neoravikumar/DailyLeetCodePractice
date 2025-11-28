package com.ravi.leetcode.twoPointer;

public class SumClosest3 {

    static void main() {
        int[] input = {-1,2,1,-4};
    }

    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        int N = nums.length-1;
        int left = 1;
        int right = left+1;
        if(N <= 2){
            return target;
        }

        while (left <= N){
            int sum = nums[left] + nums[left-1] + nums[right];
            left +=1;
            right = left + 1;
        }

        return result;
    }
}
