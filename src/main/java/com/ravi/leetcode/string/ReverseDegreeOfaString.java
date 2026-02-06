package com.ravi.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/*
Reverse Degree of a String
 */
public class ReverseDegreeOfaString {
    static void main() {
        int result = reverseDegree("zaza");
        System.out.println(result);
    }
    public static int reverseDegree(String s) {
        int result =0;
        Map<Character, Integer> charMap = new HashMap<>();
        char cc = 'z';
        for(int i=1;i<=26;i++){
            charMap.put(cc,i);
            cc -=1;
        }

        int index =1;
        for(char c:s.toCharArray()){
            result += (charMap.get(c) * index);
            index++;
        }
        return result;

    }
}
