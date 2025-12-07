package com.ravi.leetcode.arrays;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<=strs[0].length()-1;i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                sb.append(strs[0].charAt(i));
            }
            else{
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
