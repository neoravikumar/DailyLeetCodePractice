package com.ravi.java.dailyPractice;

public class FindtheIndexoftheFirstOccurrenceString {
    static void main() {
        String input = "sadbutsad";
        String validate = "sad";
        int result = strStr(input,validate);
        System.out.println(result);
    }
    public static int strStr(String haystack, String needle) {

        int hlen = haystack.length();
        int nlen = needle.length();

        for(int i=0; i<= hlen - nlen;i++){
            String ss = haystack.substring(i, i+nlen);
            if(needle.equals(ss)){
                return i;
            }
        }
        return -1;
    }
}
