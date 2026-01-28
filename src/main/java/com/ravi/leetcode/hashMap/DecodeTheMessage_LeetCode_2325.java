package com.ravi.leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage_LeetCode_2325 {
    static void main() {
        String sb = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String result = decodeMessage(sb,message);
        System.out.println(result);
    }
    public static String decodeMessage(String key, String message) {
        Map<Character,Character> keyMap = new HashMap<>();
        char ch='a';
        for(char a : key.toCharArray()){
            if(Character.isAlphabetic(a)){
                if(!keyMap.containsKey(a)){
                    keyMap.put(a,ch);
                    ch += 1;
                }

            }
        }

        StringBuilder sb = new StringBuilder();
        for(char k : message.toCharArray()){
            if(Character.isAlphabetic(k)){
                char t = keyMap.get(k);
                sb.append(t);
            }else{
                sb.append(k);
            }

        }
        return sb.toString();

    }
}
