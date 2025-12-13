package com.ravi.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement496 {

    static void main() {
        int[] input1 = {4,1,2};
        int[] input2 = {1,3,4,2};
        int[] result = nextGreaterElement(input1,input2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            myMap.put(nums2[i],i);
        }

        for(int i=0; i<nums1.length; i++){
            int startIndex = myMap.get(nums1[i]);
            int nextGreater = -1;
            for(int j = startIndex + 1; j < nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    nextGreater = nums2[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        return result;
    }
}
