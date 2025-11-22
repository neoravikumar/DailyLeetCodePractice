package com.ravi.leetcode.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    static void main() {
        int k=1;
        String s =  "AABABBA";
        int result = characterReplacement(s,k);
        System.out.println(result);

    }

    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> fMap = new HashMap<>();
        int left =0; int maxF=0; int maxWindow=0;
        for(int right=0;right<s.length();right++){
            fMap.put(s.charAt(right), fMap.getOrDefault(s.charAt(right),0)+1);
            int windowLen = right-left+1;
            maxF = Math.max(maxF, fMap.get(s.charAt(right)));

            if(windowLen-maxF>k){
                fMap.put(s.charAt(left), fMap.get(s.charAt(left))-1);
                left++;
            }
            windowLen = right-left+1;
            maxWindow= Math.max(maxWindow,windowLen);

        }
        return maxWindow;
    }
}
