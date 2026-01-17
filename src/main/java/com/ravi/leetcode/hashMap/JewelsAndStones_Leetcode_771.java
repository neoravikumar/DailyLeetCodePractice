package com.ravi.leetcode.hashMap;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones_Leetcode_771 {
    static void main() {
        int result = numJewelsInStones("aA","aAAbbbb");
        System.out.println(result);
    }
    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> cMap = new HashMap<>();
        for(char c : stones.toCharArray()){
            cMap.put(c,cMap.getOrDefault(c,0)+1);
        }
        int count=0;
        for(char k: jewels.toCharArray()){
            if(cMap.get(k)!= null && cMap.get(k)>0 ){
                count += cMap.get(k);
            }
        }
        return count;
    }
}
