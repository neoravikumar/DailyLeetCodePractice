package com.ravi.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    static void main() {
        String k = "";
        int result = firstUniqChar(k);
        System.out.println(result);
    }
    public static int firstUniqChar(String s) {
        char first = s.charAt(0);
        int index = -1;
        Map<Character, Integer> maps = new HashMap<>();
        for(char k : s.toCharArray()){
            maps.put(k, maps.getOrDefault(k, 0)+1);
        }


        for(int i=0;i<s.length();i++){
            if(maps.get(s.charAt(i))==1){
                index = i;
                break;
            }
        }
        return index;
    }
}

