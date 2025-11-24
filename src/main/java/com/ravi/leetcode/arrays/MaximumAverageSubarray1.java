package com.ravi.leetcode.arrays;

public class MaximumAverageSubarray1 {

    static void main() {
        //int[] input = {1,12,-5,-6,50,3};
        int[] input = {-1};
        int k=1;
        double result = findMaxAverage(input, k);
        System.out.println(result);

    }

    public static double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum = 0;

        // Build the first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Slide the window
        for (int right = k; right < n; right++) {
            sum += nums[right];
            sum -= nums[right - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    public static double findMaxAverage2(int[] nums, int k) {

        int N = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        double result =0.0, average=0.0;
        int left = 0;
        /*for(int i=0; i<N;i++){
            for(int j=i;j<N;j++){
                int windowSize = j-i+1;
                sum += nums[j];
                if(windowSize==k){
                    double kk = k;
                    average = sum / kk;
                    result = Math.max(result, average);
                    sum=0;
                    break;
                }
            }
        }*/
        // Using Sliding Window approach
        for ( int right=0;right<N;right++) {
            int windowSize = right - left + 1;
            sum += nums[right];
            if (windowSize == k) {
                {
                    double kk = k;
                    average = sum / kk;
                    result = Math.max(result, average);
                    sum -= nums[left];
                    left++;
                }
            }
        }
        return result;
    }
}
