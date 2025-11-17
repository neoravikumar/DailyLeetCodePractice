package com.ravi.leetcode.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    static void main() {
        //int[] input = {1,1,2};
        int[] input2 = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(input2);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int start = 0, next= 1, n = nums.length;
        for(;next<n;next++){
            if(nums[next]!=nums[start]){
                start++;
                nums[start]=nums[next];
            }
        }
        return start + 1;
    }
}
