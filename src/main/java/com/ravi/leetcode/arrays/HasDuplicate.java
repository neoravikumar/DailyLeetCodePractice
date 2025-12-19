package com.ravi.leetcode.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HasDuplicate {

    static void main() {
        int[] input = {2,3,4,5,4};
        boolean result = hasDuplicate(input);
        System.out.println(result);
    }
    public static boolean hasDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        if(nums!=null && nums.length>0){
            numSet.add(nums[0]);
        }
        for(int i=1;i<nums.length;i++){
            if(numSet.contains(nums[i])){
                return true;
            }
            else{
                numSet.add(nums[i]);
            }
        }
        return false;
    }
}
