package com.ravi.leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPatternLeetCode_290 {
    static void main() {
        boolean result = wordPattern("abba","dog cat cat dog");
        System.out.println(result);

    }
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, Integer> pMap = new HashMap<>();
        Map<String, Integer> sMap = new HashMap<>();

        for(char a : pattern.toCharArray()){
            pMap.put(a,pMap.getOrDefault(a,0)+1);
        }

        String[] words = s.split(" ");
        for(String a : words){
            sMap.put(a,sMap.getOrDefault(a,0)+1);
        }

        if(pMap.size() != sMap.size()){
            return false;
        }

        return true;

    }
}
