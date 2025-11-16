package com.ravi.leetcode.arrays;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        Arrays.sort(strs);
        char[] firstString = strs[0].toCharArray();
        char[] lastString = strs[strs.length-1].toCharArray();
        for(int i=0;i<firstString.length;i++){
            if(firstString[i] == lastString[i]){
                result += firstString[i];
            }
            else
                return result;
        }
        return result;
    }
}
