package com.ravi.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    static void main() {
        int[] nums= {1,0,1,2};

        int result = longestConsecutive(nums);
        System.out.println(result);

    }

    public static int longestConsecutive(int[] nums) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        for(int i:nums){
            min = Math.min(min, i);
            max = Math.max(max, i);
            set.add(i);
        }

        int counter=1;
        for(int i=1;i<nums.length;i++){
            min += 1;
            if(set.contains(min)){
                counter += 1;
            }
        }
return counter;
    }
}
