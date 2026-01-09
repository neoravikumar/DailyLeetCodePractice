package com.ravi.leetcode.twoPointer;

import java.util.List;
import java.util.Set;

public class ReverseVowelsOfAString {
    static void main() {
        String ss = reverseVowels("IceCreAm");
        System.out.println(ss);
    }
    public static String reverseVowels(String s) {
        int start=0;
        int end=s.length()-1;
        List<Character> vowels = List.of('a','e','i','o','u','A','E','I','O','U');
        StringBuilder sb = new StringBuilder(s);
        while(start<end){
            if(vowels.contains(s.charAt(start)) && vowels.contains(s.charAt(end))){
                //StringBuilder sb = new StringBuilder(s);
                char character = sb.charAt(start);
                sb.setCharAt(start, sb.charAt(end));
                sb.setCharAt(end, character);
                start++;
                end--;
            }
            if(!vowels.contains(s.charAt(end))){
                end--;
            }
            if(!vowels.contains(s.charAt(start))){
                start++;
            }
        }
        return sb.toString();
    }
    // Approach 2
    public String reverseVowels22(String s) {

        int left = 0, right = s.length() - 1;
        //List<Character> vowels = List.of('a','e','i','o','u','A','E','I','O','U');
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        StringBuilder sb = new StringBuilder(s);

        while(left < right){
            while (left < right && !vowels.contains(sb.charAt(left))) {
                left++;
            }
            while (left < right && !vowels.contains(sb.charAt(right))) {
                right--;
            }

            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);

            left++;
            right--;
        }
        return sb.toString();

    }
}
