package com.ravi.leetcode.binarySearch;

import java.util.OptionalInt;

public class BinarySearch {
    static void main() {
        int[] nums = {-1, 2, 9, 41, 55, 98};
        int target = 41;
        int result = search(nums, target);
        System.out.println("Result is :>>" + result);
    }

    public static int search(int[] nums, int target) {
        var result = binarySearch(nums, target, 0, nums.length - 1);
        return result.getAsInt();

    }


    static OptionalInt binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return OptionalInt.empty();
        }
        int mid = left + (right - left) / 2;

        return switch (Integer.compare(arr[mid], target)) {
            case 0 -> OptionalInt.of(mid);
            case -1 -> binarySearch(arr, target, mid + 1, right);
            case 1 -> binarySearch(arr, target, left, mid - 1);
            default -> OptionalInt.empty();
        };
    }

}




