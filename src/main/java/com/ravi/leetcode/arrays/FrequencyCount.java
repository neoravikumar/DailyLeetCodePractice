package com.ravi.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : nums) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        int n = nums.length/2;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue()>n){
                return entry.getKey();
            }
        }
        return 0;

    }
        public static void main(String[] args) {
            int[] numbers = {5, 1, 2, 1, 1, 4, 2, 1, 5, 1,1};
            int result = majorityElement(numbers);
            System.out.println(result);
        }
}
