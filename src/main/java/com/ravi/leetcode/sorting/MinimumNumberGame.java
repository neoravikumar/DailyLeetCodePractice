package com.ravi.leetcode.sorting;

import java.util.Arrays;

/**
 * 2974. Minimum Number Game
 * https://leetcode.com/problems/minimum-number-game/description/
 */
public class MinimumNumberGame {
    static void main() {
        int[] result = numberGame(new int[]{5,4,2,3});
        System.out.println(result);

    }
    public static int[] numberGame(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] arr = new int[n];
        int k=0;
        for(int i=0;i<n;){
            int first = nums[i];
            int second = nums[i+1];
            arr[k]=second;
            arr[++k] = first;
            i+=2;
            k++;
        }
        return arr;
    }
}
