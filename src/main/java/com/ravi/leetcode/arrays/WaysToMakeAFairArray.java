package com.ravi.leetcode.arrays;

public class WaysToMakeAFairArray {
    static void main() {
        //int[] nums = {2,1,6,4};
        int[] nums1 = {1,1,1};
        int result = waysToMakeFair(nums1);
        System.out.println(result);
    }

    public static int waysToMakeFair(int[] nums) {

        int result =0;
        int n = nums.length;

        int[] evenSum = new int[n + 1];
        int[] oddSum = new int[n + 1];

        for (int i = 0; i < n; i++) {
            evenSum[i + 1] = evenSum[i];
            oddSum[i + 1] = oddSum[i];

            if (i % 2 == 0) {
                evenSum[i + 1] += nums[i];
            } else {
                oddSum[i + 1] += nums[i];
            }
        }

        int totalEven = evenSum[n];
        int totalOdd = oddSum[n];

        // Evaluate each removal possibility
        for (int i = 0; i < n; i++) {
            int newEvenSum = evenSum[i] + (totalOdd - oddSum[i + 1]);
            int newOddSum = oddSum[i] + (totalEven - evenSum[i + 1]);

            if (newEvenSum == newOddSum) {
                result++;
            }
        }
        return result;

    }

    public int waysToMakeFairSolutions(int[] nums) {

        int result = 0;
        int n = nums.length;

        int totalEven = 0;
        int totalOdd = 0;

        // Calculate total sums for even and odd indices
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) totalEven += nums[i];
            else totalOdd += nums[i];
        }

        int currEven = 0;
        int currOdd = 0;

        for (int i = 0; i < n; i++) {
            // If we remove nums[i], the sums for the remaining array are:
            // New Even Sum = (Even elements before i) + (Odd elements after i)
            // New Odd Sum = (Odd elements before i) + (Even elements after i)
            int newEvenSum, newOddSum;
            if (i % 2 == 0) {
                // nums[i] is even
                newEvenSum = currEven + (totalOdd - currOdd);
                newOddSum = currOdd + (totalEven - currEven - nums[i]);
            } else {
                // nums[i] is odd
                newEvenSum = currEven + (totalOdd - currOdd - nums[i]);
                newOddSum = currOdd + (totalEven - currEven);
            }
            if (newEvenSum == newOddSum) {
                result++;
            }
            // Update running prefix sums
            if (i % 2 == 0) currEven += nums[i];
            else currOdd += nums[i];
        }
        return result;
    }

}