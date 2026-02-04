package com.ravi.leetcode.hashMap;

public class NumberOfArithmeticTriplets {

    static void main() {
        int result = arithmeticTriplets(new int[]{0,1,4,6,7,10},3);
        System.out.println(result);
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
            // Constraints state nums[i] <= 200, so a boolean array of size 201 is sufficient.
            boolean[] seen = new boolean[201];
            int count = 0;

            for (int num : nums) {
                // Check if num - diff AND num - 2*diff have been seen before.
                // If they have, a triplet is formed with the current 'num' as the third element.
                if (num >= 2 * diff && seen[num - diff] && seen[num - (2 * diff)]) {
                    count++;
                }
                // Mark the current number as seen.
                seen[num] = true;
            }

            return count;
        }
}
