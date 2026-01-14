package com.ravi.leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII_LeetCode_219 {
    static void main() {
        int[] input = {1,2,3,1,2,3};
        boolean result = containsNearbyDuplicate(input, 1);
        System.out.println(result);

    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int value = nums[i];
            if(map.containsKey(value)){
                int index = map.get(value);
                if(Math.abs(i-index)<=k){
                    return true;
                }
            }
            map.put(value, i);
        }
        return false;
    }
}
