package com.ravi.leetcode.string;

public class LongestPalindromicSubstring_LeetCode_5 {

    static void main() {
        String result = longestPalindrome("babad");
        System.out.println(result);
    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        int longest = Integer.MIN_VALUE;
        String longestStr = "";
        // Brurte Force
        /*for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(isPalindrome(s, i, j)){
                    String subStr = s.substring(i,j+1);
                    if(subStr.length()>longestStr.length()){
                        longestStr = subStr;
                    }
                }
            }
        }*/

        for (int i = 0; i < len; i++) {
            if (len - i <= longestStr.length()) break;
            for (int j = len - 1; j >= i; j--) {
                // If this specific substring is shorter than our longest, skip j
                if (j - i + 1 <= longestStr.length()) break;

                if (isPalindrome(s, i, j)) {
                    longestStr = s.substring(i, j + 1);
                    // Since we started from the end, the first palindrome we find
                    // for this 'i' is the longest possible for this 'i'.
                    break;
                }
            }
        }


        return longestStr;
    }

    public static boolean isPalindrome(String s,int i, int j){
        for(;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
