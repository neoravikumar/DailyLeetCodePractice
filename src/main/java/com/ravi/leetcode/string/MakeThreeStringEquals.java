package com.ravi.leetcode.string;

public class MakeThreeStringEquals {
    static void main() {
        int result = findMinimumOperations("dacdd","dac","dac");
        System.out.println(result);

    }
    public static int findMinimumOperations(String s1, String s2, String s3) {

        if(s1.charAt(0) != s2.charAt(0)){
            if(s1.charAt(0) != s3.charAt(0)){
                return -1;
            }
        }

        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();

        // Find the length of the longest possible common prefix
        int minLength = Math.min(Math.min(len1, len2), len3);
        int commonPrefixLength = 0;


        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
                commonPrefixLength++;
            } else {
                break;
            }
        }

        if (commonPrefixLength == 0) {
            return -1;
        }
        int operations = (len1 - commonPrefixLength) + (len2 - commonPrefixLength) + (len3 - commonPrefixLength);

        return operations;
    }
}
