package com.ravi.leetcode.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {

    static void main() {
        //int[] nums = {1, 0, 1, 2};
        //int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        int[] nums = {100,4,200,1,3,2};
        //int[] nums = {0,3,7,2,5,8,4,6,0,1};
        //int[] nums = {-8,-4,9,9,4,6,1,-4,-1,6,8};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }

    public static int longestConsecutive(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        if (nums.length <= 0) {
            return 0;
        }
        for(int a:nums){
            set.add(a);
        }
        int counter = 0,maxCounter=0;
        for(int n : set) {
            if(!set.contains(n - 1)) {
                int m = n + 1;
                while(set.contains(m)) {
                    m++;
                }
                maxCounter = Math.max(maxCounter, m - n);
            }
        }
        return maxCounter;
    }
}
