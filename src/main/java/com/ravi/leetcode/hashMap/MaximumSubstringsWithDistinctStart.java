package com.ravi.leetcode.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximumSubstringsWithDistinctStart {

    public static int maxDistinct(String s) {
        char[] allChar = s.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();
        for(char a : s.toCharArray()){
            charMap.put(a,1);
        }

        return charMap.size();
    }


}
