package com.ravi.leetcode.arrays;

import java.util.*;

public class ContainsDuplicateInt {

    static void main() {
        int[] numbers = {1};
        int[] newInt = {3};
        int[] result = intersection(numbers, newInt);
        System.out.println(Arrays.toString(result));

        /*String s="anagram";
        String t="nagaram";
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0)+1);
        }
        System.out.println(charMap);
        for(int i=0;i<t.length();i++){
            if(charMap.containsKey(t.charAt(i)) && charMap.get(t.charAt(i))>0){
             charMap.put(t.charAt(i), charMap.get(t.charAt(i))-1);
            }
            else{
                return false;
            }
        }*/
    }

    public static int[] intersection(int[] nums1, int[] nums2) {


        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums1){
            map.put(i, map.getOrDefault(1, 0)+1);
        }
        Set<Integer> myArray = new HashSet<>();
        for(int k:nums2)
        {
            if(map.containsKey(k)){
                myArray.add(k);
            }
        }
        return myArray.stream().mapToInt(Integer::intValue).toArray();
    }
}
