package com.ravi.leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {
    static void main() {
        int[] nums = {0,1,2,4,5,7};
        List<String>  result = summaryRanges(nums);
        System.out.println(result);
    }
    public static List<String> summaryRanges(int[] nums) {
            if (nums == null || nums.length == 0) {
                return new ArrayList<>();
            }
            int n = nums.length;
            int start = nums[0];
            List<String> result = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (nums[i] != nums[i - 1] + 1) {
                    if (start == nums[i - 1]) {
                        result.add(Integer.toString(start));
                    } else {
                        result.add(start + "->" + nums[i - 1]);
                    }
                    start = nums[i];
                }
            }

            // Handle the last range
            if (start == nums[nums.length - 1]) {
                result.add(Integer.toString(start));
            } else {
                result.add(start + "->" + nums[nums.length - 1]);
            }

            return result;
    }
}
