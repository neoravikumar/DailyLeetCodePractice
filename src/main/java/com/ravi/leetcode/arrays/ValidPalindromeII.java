package com.ravi.leetcode.arrays;

// https://leetcode.com/problems/valid-palindrome-ii/description/
public class ValidPalindromeII {

    static void main() {
        String s = "abc";
        boolean result = validPalindrome(s);
        System.out.println(result);
    }


    public static boolean validPalindrome(String s) {
        int start =0;
        int end = s.length()-1;
        while (start < end) {
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }else{
                return isPalindrome(s, start+1, end) || isPalindrome(s, start, end-1);
            }
        }
        return true;
    }

    static boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
