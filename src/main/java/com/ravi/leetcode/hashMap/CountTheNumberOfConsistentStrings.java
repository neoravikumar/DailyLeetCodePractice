package com.ravi.leetcode.hashMap;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistentStrings {
    static void main() {
        String allowed = "abc";
        //String[] words = {"ad","bd","aaab","baa","badab"};
        String[] words = {"a", "b", "c", "ab", "ac", "bc", "abc"};
        int result = countConsistentStrings(allowed, words);
        System.out.println(result);

    }

    public static int countConsistentStrings(String allowed, String[] words) {

        // Using Set Approach
       /* Set<Character> mySet = new HashSet<>();
        int result = 0;
        for(char a : allowed.toCharArray()){
            mySet.add(a);
        }
        for(String s: words){
            boolean add = true;
            for(char k : s.toCharArray()){
                if(!mySet.contains(k)){
                    add = false;
                    break;
                }
            }
            if(add){
                result++;
            }

        }
        return result;

        */

        // Using Boolean Array
        /*boolean[] allowedArr = new boolean[26];
        int result = 0;
        for (char c : allowed.toCharArray()) {
            allowedArr[c - 'a'] = true;
        }
        boolean add = true;
        for (String s : words) {
            for (char k : s.toCharArray()) {
                if (!allowedArr[k - 'a']) {
                    add = false;
                    break;
                }
            }
            if (add) {
                result++;
            }
        }
        return result;
        */


        // Using BitMask Approach
        int mask = 0;
        int result = 0;
        for (char c : allowed.toCharArray()) {
            mask |= 1 << (c - 'a');
        }
        boolean add = true;
        for (String s : words) {
            for (char k : s.toCharArray()) {
                if ((mask & (1 << (k - 'a'))) == 0) {
                    add = false;
                    break;
                }
            }
            if (add) {
                result++;
            }
        }
        return result;
    }
}
