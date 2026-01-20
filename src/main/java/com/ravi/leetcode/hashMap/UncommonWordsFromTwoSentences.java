package com.ravi.leetcode.hashMap;

import java.util.*;

public class UncommonWordsFromTwoSentences {
    static void main() {
        String[] result2 = uncommonFromSentences("this apple is sweet","this apple is sour");
        String[] result = uncommonFromSentences("sweet sweet","apple");
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result));

    }
    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> sMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        countWords(s1,sMap);
        countWords(s2,sMap);
        for(Map.Entry<String,Integer> map : sMap.entrySet()){
            if(map.getValue()==1){
                result.add(map.getKey());
            }
        }
        return  result.toArray(String[]::new);
    }
    private static void countWords(String s, Map<String, Integer> map) {
        for (String word : s.split("\\s+")) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
    }

}
