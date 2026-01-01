package com.ravi.leetcode.twoPointer;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CountPairOfWhoseSumIsLessThanTarget {

    static void main() {
        List<Integer> input = List.of(-1,1,2,3,1);
        int result = countPairs(input, 2);
        System.out.println(result);
    }

    // Using two pointer
    public static int countPairs2(List<Integer> nums, int target) {
        // Step 1: Sort the list - O(n log n)
        Collections.sort(nums);

        int count = 0;
        int left = 0;
        int right = nums.size() - 1;

        // Step 2: Two-pointer search - O(n)
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                // All pairs between left and right are valid
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static int countPairs(List<Integer> nums, int target) {

        int n = nums.size()-1;
        int start = 0;
        int end = 1;
        int counter = 0;
        while(start<n){
            if(start < end && nums.get(start) + nums.get(end) < target){
                counter += 1;

            }
            if(end<n) end++;
            else if(end == n){
                start += 1;
                end = start +1;
            }
            else if (start == n){
                start++;
            }
        }
        return counter;
    }
}
