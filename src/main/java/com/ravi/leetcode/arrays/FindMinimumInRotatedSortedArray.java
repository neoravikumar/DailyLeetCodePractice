package com.ravi.leetcode.arrays;

public class FindMinimumInRotatedSortedArray {

    static void main() {
        int result = findMin(new int[]{3,4,5,1,2});
        System.out.println(result);
    }

    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0, right = nums.length - 1;
        if (nums[left] <= nums[right]) {
            return nums[left];
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
