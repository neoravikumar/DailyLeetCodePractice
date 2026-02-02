package com.ravi.leetcode.string;

// 3794. Reverse String Prefix

public class ReverseStringPrefix {
    static void main() {
        String rs = reversePrefix("abcduio",3);
        System.out.println(rs);
    }
    public static  String reversePrefix(String s, int k) {
        int n = s.length();
        if(k==1){
            return s;
        }
        StringBuilder reversed = new StringBuilder(s.substring(0,k));
        reversed.reverse();
        reversed.append(s.substring(k,n));
        return reversed.toString();
    }
}
