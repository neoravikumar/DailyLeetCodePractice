package com.ravi.leetcode.twoPointer;

// Rearrange Array Elements by Sign
// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/?envType=problem-list-v2&envId=two-pointers

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    static void main() {
        int[] result = rearrangeArray(new int[] {3,1,-2,-5,2,-4});
        System.out.println(Arrays.toString(result));

    }
    public static int[] rearrangeArray(int[] nums) {
        int[] posArray = new int[nums.length/2];
        int posIndex=0, negIndex=0;
        int[] negArray = new int[nums.length/2];
        int[] rArray = new int[nums.length];

        for(int k=0;k<nums.length;k++){
            if(nums[k]>0){
                posArray[posIndex] = nums[k];
                posIndex++;
            }else{
                negArray[negIndex] = nums[k];
                negIndex++;
            }
        }

        int counter=0;
        for(int k=0;k<nums.length/2;k++){
            rArray[counter++] = posArray[k];
            rArray[counter++] = negArray[k];
        }
        return rArray;
    }

    // Two Pointer Approach
    public static int[] rearrangeArray2(int[] nums) {
        // The result array will have the same length as the input array.
        int[] result = new int[nums.length];

        // Initialize pointers for the next position of positive and negative numbers.
        // Positive numbers go to even indices (0, 2, 4, ...).
        int posIndex = 0;
        // Negative numbers go to odd indices (1, 3, 5, ...).
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                // Move the positive pointer to the next even index.
                posIndex += 2;
            } else {
                result[negIndex] = num;
                // Move the negative pointer to the next odd index.
                negIndex += 2;
            }
        }
        return result;
    }
}
