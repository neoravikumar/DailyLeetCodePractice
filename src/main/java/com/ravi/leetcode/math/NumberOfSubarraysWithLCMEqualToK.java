package com.ravi.leetcode.math;

public class NumberOfSubarraysWithLCMEqualToK {
    static void main() {
       int result =  subarrayLCM(new int[]{3},2);
        System.out.println(result);
    }
    /*public static int subarrayLCM(int[] nums, int k) {
        int n = nums.length;
        int result = 0;
        for(int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                if(nums[j] % k == 0){
                    result++;
                }
            }
        }
    return result;
    }*/

    public static int subarrayLCM(int[] nums, int k) {
        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            // Start the current subarray from index i
            int currentLCM = nums[i];
            for (int j = i; j < n; j++) {
                // Update LCM as we expand the subarray to index j
                currentLCM = lcm(currentLCM, nums[j]);

                // Optimization: if the current LCM exceeds k, all larger subarrays starting at i
                // will also have an LCM greater than k, so we can break the inner loop.
                if (currentLCM > k) {
                    break;
                }

                // If the current LCM equals k, we found a valid subarray
                if (currentLCM == k) {
                    result++;
                }
            }
        }
        return result;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper function to calculate the least common multiple (LCM)
    private static int lcm(int a, int b) {
        if (a == 0 || b == 0) return 0;
        // LCM = (|a * b|) / GCD(a, b), but we can use long to avoid potential overflow
        long res = (long)a * b;
        return (int)(res / gcd(a, b));
    }
}
