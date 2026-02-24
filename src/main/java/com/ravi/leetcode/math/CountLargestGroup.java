package com.ravi.leetcode.math;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountLargestGroup {
    static void main() {

        int n=23;
        int result = countLargestGroup(n);
        System.out.println(result);

    }
    public static int countLargestGroup(int n) {
        int[] counts = new int[37];
        int maxFrequency = 0;

        for (int i = 1; i <= n; i++) {
            int sum = getSum(i);
            counts[sum]++;
            // Track the largest group size found so far
            maxFrequency = Math.max(maxFrequency, counts[sum]);
        }

        int largestGroupCount = 0;
        for (int freq : counts) {
            if (freq == maxFrequency) {
                largestGroupCount++;
            }
        }
        return largestGroupCount;
    }

        private static int getSum(int num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            return sum;
        }

}
