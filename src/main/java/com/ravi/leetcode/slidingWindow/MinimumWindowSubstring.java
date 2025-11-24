package com.ravi.leetcode.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    static void main() {

        String s = "ADOBECODEBAN";
        String t = "ABC";

        String result = new MinimumWindowSubstring().minWindow(s, t);
        System.out.println(result);

    }

    public String minWindow(String s, String t) {
        Map<Character, Integer> tMap = new HashMap<>();
        for(char c : t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c,0)+1);
        }
        int matched=0;
        int minLength = Integer.MAX_VALUE;
        int start =0;
        int windowStart=0;
        for(int windowEnd=0;windowEnd<s.length();windowEnd++){
            char currentChar = s.charAt(windowEnd);
            if(tMap.containsKey(currentChar)){
                tMap.put(currentChar, tMap.get(currentChar)-1);
                if(tMap.get(currentChar)>=0){
                    matched +=1;
                }
            }
            while(matched==t.length()){
                if(minLength > (windowEnd-windowStart+1)){
                    minLength = windowEnd-windowStart+1;
                    start = windowStart;
                }
                char leftChar = s.charAt(windowStart++);
                if(tMap.containsKey(leftChar)){
                    if(tMap.get(leftChar)==0){
                        matched -=1;
                    }
                    tMap.put(leftChar, tMap.get(leftChar)+1);
                }
            }
        }
        if(minLength>s.length()){
            return "";
        }
        return s.substring(start, start+minLength);
    }
}

