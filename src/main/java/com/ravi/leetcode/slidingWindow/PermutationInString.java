package com.ravi.leetcode.slidingWindow;

import java.util.Arrays;

public class PermutationInString {
    static void main() {
        String s1 = "oo", s2 = "eidooo";
        boolean result = new PermutationInString().checkInclusion(s1,s2);
        System.out.println(result);

    }
    public boolean checkInclusion(String s1, String s2) {
        boolean result = false;
        int[] pFreq = new int[26];
        int[] winFreq = new int[26];
        // frequency Array of first String which we have to check in another
        for (char c : s1.toCharArray()) {
            pFreq[c - 'a']++;
        }
        int winMaxLength = s1.length();
        for(int i=0;i<s2.length();i++){
            winFreq[s2.charAt(i) - 'a']++;
            if(i>=winMaxLength){
                winFreq[s2.charAt(i - winMaxLength) - 'a']--;
            }
            if(i>=winMaxLength-1 && Arrays.equals(winFreq, pFreq)){
                return true;
            }
        }
        return result ;
    }
}
