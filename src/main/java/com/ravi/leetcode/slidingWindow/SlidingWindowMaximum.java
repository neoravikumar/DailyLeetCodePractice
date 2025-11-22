package com.ravi.leetcode.slidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 239. Sliding Window Maximum
 * Hard
 *
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 *
 * Return the max sliding window.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * Output: [3,3,5,5,6,7]
 * Explanation:
 * Window position                Max
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * 1 <= k <= nums.length
 */
public class SlidingWindowMaximum {

    static void main() {
        int[] input = {1,3,-1,-3,5,3,6,7};
        //int[] input = {1,-1};
        int k=3;
        int[] result = maxSlidingWindow2(input, k);
        System.out.println(Arrays.toString(result));
    }


    public static int[] maxSlidingWindow(int[] nums, int k) {
        int N = nums.length;
        if(nums.length==1){
            return nums;
        }
        int resultArraySize = N-k+1;
        int[] resultArray = new int[resultArraySize];


        for(int left=0, right=k-left-1;right<N;right++){
            int max = findMaximumInArray(nums, left, right);
            resultArray[left] = max;
            left++;
        }
        return resultArray;

    }

    public static  int findMaximumInArray(int[] nums, int start, int end){
        int MAX = Integer.MIN_VALUE;
        for(;start<=end;start++){
            MAX = Math.max(MAX, nums[start]);
        }
        return MAX;
    }

    // Optimized Version
    public static int[] maxSlidingWindow2(int[] nums, int k) {

        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];

        int left = 0;
        int idx = 0;

        for (int right = 0; right < n; right++) {

            // Rule 1: remove elements out of window
            while (!dq.isEmpty() && dq.peekFirst() < left) {
                dq.pollFirst();
            }

            // Rule 2: maintain decreasing order
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[right]) {
                dq.pollLast();
            }

            // add current index
            dq.offerLast(right);

            // Rule 3: store max when window size == k
            if (right - left + 1 == k) {
                res[idx++] = nums[dq.peekFirst()];
                left++;
            }
        }

        return res;
    }

}
