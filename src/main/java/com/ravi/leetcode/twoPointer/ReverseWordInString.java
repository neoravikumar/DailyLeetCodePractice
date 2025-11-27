package com.ravi.leetcode.twoPointer;


import java.util.Arrays;

public class ReverseWordInString {
    static void main() {

        String input = "the sky   is blue";
        // output = blue is sky the
        String result = reverseWords(input);
        System.out.println("Result is :>> "+ result);


    }
    public static  String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length()-1;
        while(end>=0){

            while(end>=0 && s.charAt(end) == ' '){
                end--;
            }
            if (end < 0) break;

            int start = end;
            while(start>=0 && s.charAt(start) != ' '){
                start--;
            }

            String partString = s.substring(start+1, end+1);
            sb.append(partString);
            sb.append(" ");
            end = start -1;
        }
        return sb.toString().trim();
    }
}
