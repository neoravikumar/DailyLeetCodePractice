package com.ravi.leetcode.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class SubstringsOfSizeThreeWithDistinctCharacters {
    static void main() {

        int count = countGoodSubstrings("xyzzaz");
        System.out.println(count);

    }
    public static int countGoodSubstrings(String s) {
        int start=0;
        int end=3;
        if(s.length()<3){
            return 0;
        }
        int result =0;
        while(end<=s.length()){
            String ss = s.substring(start, end);
            if(isUnique(ss)){
                result +=1;
            }
            start++;
            end++;
        }
        return result;
    }

    static boolean isUnique(String s){
        if(s.charAt(0) != s.charAt(1)){
            if(s.charAt(1) != s.charAt(2)){
                if(s.charAt(0)!=s.charAt(2)){
                    return true;
                }
            }
        }
        else{
            return false;
        }
        return false;
    }
    // Approach 2
    public static int countGoodSubstrings22(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            set.add(s.charAt(i + 1));
            set.add(s.charAt(i + 2));

            if (set.size() == 3) count++;
        }
        return count;
    }
}
