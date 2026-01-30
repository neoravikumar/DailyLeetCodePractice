package com.ravi.leetcode.hashMap;

import java.util.Map;
import java.util.TreeMap;

public class MostFrequentEvenElement {
    static void main() {
            int result = mostFrequentEven(new int[]{4,4,4,9,2,4});
        System.out.println(result);
    }
    public static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int maxFreq = 0;
        int mostFrequentElement = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();

            // Check if current frequency is greater than maxFreq
            // or if it's equal but the current element is smaller (tie-breaker)
            if (freq > maxFreq) {
                maxFreq = freq;
                mostFrequentElement = element;
            }
        }
        return mostFrequentElement;
    }
}
