package com.ravi.leetcode.hashMap;

import java.util.Arrays;

public class TheTwoSneakyNumbersOfDigitville_LeetCode_3289 {
    static void main() {
        int[] input = {0,3,2,1,3,2};
        int[] result = getSneakyNumbers(input);
        System.out.println(Arrays.toString(result));


    }
    public static int[] getSneakyNumbers(int[] nums) {
        /*int[] result = new int[2];
        Map<Integer, Integer> myMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            myMap.put(nums[i],myMap.getOrDefault(nums[i],0)+1);
        }
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : myMap.entrySet()){
            if(entry.getValue()==2){
                result[index] = entry.getKey();
                index++;
            }
        }
        return result;
        */
        int n = nums.length;
        boolean[] a = new boolean[n];
        int[] ar = new int[2];
        int k = 0;
        for(int i = 0;i<n;i++){
            if(a[nums[i]]==true) ar[k++] = nums[i];
            else a[nums[i]] = true;
        }
        return ar;
    }
}
