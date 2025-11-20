package com.ravi.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualToK {

    static void main() {
        //int[] input = {1, 1, 1};
        int[] input = {1, 2, 3};
        //int[] input = {9,4,20,3,10,5};
        int result = subarraySum(input, 3);
        System.out.println(result);


    }

    public static int subarraySum(int[] nums, int k) {
        int N = nums.length;
        int count = 0;
        // Brute Force
        /*for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += nums[j];
                if (sum == k) {
                    count += 1;
                }
            }
        }*/

        /* Optimal Approach */
        Map<Integer, Integer> freMap = new HashMap<>();
        freMap.put(0, 1);
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += nums[i];
            if (freMap.containsKey(sum - k)) {
                count += freMap.get(sum - k);
            }
            freMap.put(sum, freMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
