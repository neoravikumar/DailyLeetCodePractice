package com.ravi.leetcode.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    static void main() {

        int[] input = {1,2,3,4};
        int[] result = productExceptSelf(input);
        System.out.println(Arrays.toString(result));
    }
    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] left_ops = new int[N];
        int[] right_ops = new int[N];
        left_ops[0] = 1;
        right_ops[N-1] = 1;
        for(int i=1;i<N;i++){
            left_ops[i] = left_ops[i-1] * nums[i-1];
        }
        for(int i=N-2;i>=0;i--){
            right_ops[i] = right_ops[i+1] * nums[i+1];
        }
        for(int i=0;i<N;i++){
            nums[i] = left_ops[i] * right_ops[i];
        }
    return nums;
    }

}
