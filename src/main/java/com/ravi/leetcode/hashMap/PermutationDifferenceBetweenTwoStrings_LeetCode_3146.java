package com.ravi.leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;

public class PermutationDifferenceBetweenTwoStrings_LeetCode_3146 {
    static void main() {
        int result = findPermutationDifference("abc","bac");
        System.out.println(result);

    }
    public static int findPermutationDifference(String s, String t) {
        Map<Character, Integer> charMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            charMap.put(s.charAt(i),i);
        }

        int sum =0;
        for(int i=0;i<t.length();i++){
            sum += Math.abs(charMap.get(t.charAt(i))-i);
        }
        return sum;
    }
}
