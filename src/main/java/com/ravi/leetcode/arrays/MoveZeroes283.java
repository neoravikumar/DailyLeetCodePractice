package com.ravi.leetcode.arrays;

import static com.ravi.leetcode.arrays.MoveZeroes283.swap;

public class MoveZeroes283 {
    static void main() {

        int[] input = {0,1,0,3,12};
        moveZeroes(input);
        System.out.println(input);


    }
    public static void moveZeroes(int[] nums) {

        int N = nums.length;
        for(int i=0;i<N;i++){
            for(int k=i+1;k<N;k++){
                if(nums[i]==0 && nums[k]!=0){
                    MoveZeroes283.swap(nums, i, k);
                }
            }
        }

    }
    public static void swap(int[] nums , int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
