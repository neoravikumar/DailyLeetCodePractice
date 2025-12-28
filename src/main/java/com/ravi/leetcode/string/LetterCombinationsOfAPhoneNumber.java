package com.ravi.leetcode.string;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/?envType=problem-list-v2&envId=hash-table

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 17. Letter Combinations of a Phone Number
public class LetterCombinationsOfAPhoneNumber {
    static void main() {
        String ab = "234";
        List<String> result = letterCombinations(ab);
        System.out.println(result);


    }
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Integer,String> digitMap = new HashMap<>();
        digitMap.put(2,"abc");
        digitMap.put(3,"def");
        digitMap.put(4,"ghi");
        digitMap.put(5,"jkl");
        digitMap.put(6,"mno");
        digitMap.put(7,"pqrs");
        digitMap.put(8,"tuv");
        digitMap.put(9,"wxyz");

        int nDigits = Integer.valueOf(digits);

        while(nDigits>0){
            int lastDigit = nDigits %10;
            String lastDigits = digitMap.get(lastDigit);
            char[] allChars = lastDigits.toCharArray();
            if(result.isEmpty()){
                for(char a:allChars){
                    result.add(String.valueOf(a));
                }
            }else{
                for(char a:allChars) {
                    for (int i = 0; i < result.size(); i++) {
                        String k = a + result.get(i);
                        System.out.print(k+"\t");
                    }
                    System.out.println("");
                }
            }
            nDigits = nDigits / 10;
        }
        return result;
    }
}
