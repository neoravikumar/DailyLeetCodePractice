package com.ravi.leetcode.hashMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindMostFrequentVowelAndConsonant {

    static void main() {
        int result = maxFreqSum("successes");
        System.out.println(result);

    }

    public static int maxFreqSum(String s) {
        Map<Character, Integer> vFreq = new HashMap<>();
        Map<Character, Integer> cFreq = new HashMap<>();
        List<Character> vList = List.of('a','e','i','o','u');
        for(char a : s.toCharArray()){
            if(vList.contains(a)){
                vFreq.put(a, vFreq.getOrDefault(a,0)+1);
            }else{
                cFreq.put(a, cFreq.getOrDefault(a,0)+1);
            }
        }
        int maxV = 0;
        int maxC = 0;
        for(char k : vFreq.keySet()){
            maxV = Math.max(maxV, vFreq.get(k));
        }
        for(char k : cFreq.keySet()){
            maxC = Math.max(maxC, cFreq.get(k));
        }

        return maxV+maxC;

    }
}
