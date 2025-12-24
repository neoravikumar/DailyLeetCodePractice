package com.ravi.leetcode.string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordsContainingCharacter {
    static void main() {
        String[] words = {"leet","code"};
        char x = 'e';
        List<Integer> result = findWordsContaining(words, x);
        System.out.println(result);

    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> resultList = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(isExists(words[i],x)){
                resultList.add(i);
            }
        }
        return resultList;
    }

    public static boolean isExists(String s, char x){
        for(char k : s.toCharArray()){
            if(k==x){
                return true;
            }
        }
        return false;
    }
}
