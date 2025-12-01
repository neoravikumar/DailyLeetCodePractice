package com.ravi.leetcode.maps;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    static void main() {
        String ransomNote = "aa";
        String magazine = "ab";

        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineArray = new HashMap<>();
        for(char a : magazine.toCharArray()){
            magazineArray.put(a, magazineArray.getOrDefault(a,0)+1);
        }

        for(char b: ransomNote.toCharArray()){
            if(!magazineArray.containsKey(b)){
                return false;
            }
            else{
                int value = Integer.valueOf(magazineArray.get(b));
                if(value <= 0){
                    return false;
                }
                magazineArray.put(b, magazineArray.getOrDefault(b, 0)-1);
            }
        }
        return true;
    }
}
