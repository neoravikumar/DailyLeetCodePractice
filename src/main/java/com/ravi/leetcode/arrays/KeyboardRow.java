package com.ravi.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LeetCode 500 https://leetcode.com/problems/keyboard-row/description/?envType=problem-list-v2&envId=array
public class KeyboardRow {
    static void main() {

        String[] input = {"Hello","Alaska","Dad","Peace"};
        String[] result = findWords(input);
        System.out.println(Arrays.toString(result));

    }

    public static String[] findWords(String[] words) {

        List<Character> firstRowList = List.of('q','w','e','r','t','y','u','i','o','p');
        List<Character> secondRowList = List.of('a','s','d','f','g','h','j','k','l');
        List<Character> thirdRowList = List.of('z','x','c','v','b','n','m');

        List<String> resultArray = new ArrayList<>();

        for(String s : words){
            String k = s.toLowerCase();
            boolean result = false;
            if(firstRowList.contains(k.charAt(0))){
                result = checkAndReturn(firstRowList,k);
            }else if(secondRowList.contains(k.charAt(0))){
                result = checkAndReturn(secondRowList,k);
            }else{
                result = checkAndReturn(thirdRowList,k);
            }

            if(result){
                resultArray.add(s);
            }

        }
        String[] stringArray = new String[resultArray.size()];

        return resultArray.toArray(stringArray);
    }

    static boolean checkAndReturn(List<Character> arr, String s){
        for(char c: s.toCharArray()){
            if(!arr.contains(c)){
                return false;
            }
        }
        return true;
    }
}
