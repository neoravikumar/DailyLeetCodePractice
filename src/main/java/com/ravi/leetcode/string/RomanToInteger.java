package com.ravi.leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static void main() {
        int result = romanToInt("MCMXCIV");
        //int result = romanToInt("LVIII");
        System.out.println(result);
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        map.put('X',10);

        int total = 0;
        int n = s.length();

        for(int i=0;i<n;i++){
            int currValue = map.get(s.charAt(i));
            if(i+1<n && currValue < map.get(s.charAt(i+1))){
                total = total - currValue;
            }else{
                total = total + currValue;
            }
        }
        return total;
    }
}
