package com.ravi.leetcode.string;

import java.util.Arrays;

public class ReverseString {
    static void main() {
        String s = swap("DALDA");
        System.out.println(s);

    }
    public static String swap(String input){
        int start = 0;
        int end = input.length()-1;
        char[] charArray = input.toCharArray();
        while(start<end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return Arrays.toString(charArray);
    }
}
