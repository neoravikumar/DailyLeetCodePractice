package com.ravi.leetcode.arrays;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EncodeAndDecodeStrings {

    static void main() {
        List<String> input = List.of("neet","code","love","you","#");
       //List<String> input = List.of("");
        //List<String> input = List.of("we","say",":","yes","!@#$%^&*()");
        String encodedString = encode(input);
        List<String> resultString = decode(encodedString);
        System.out.println(resultString);
    }


    public static String encode(List<String> input) {
        StringBuilder singleString = new StringBuilder();
        for (String pString : input) {
            singleString.append(pString.length()).append("#").append(pString);
        }
        return singleString.toString();
    }

    /*public static List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int startIndex =0;
        while (startIndex<str.length()) {
            int nIndex = str.indexOf('#');
            String prefixString = str.substring(0,nIndex);
            int numberValue = Integer.valueOf(prefixString);
            int subStringEndIndex = numberValue+1+prefixString.length();
            String subStr = str.substring(nIndex+1,subStringEndIndex);
            result.add(subStr);
            str = str.substring(startIndex+1+prefixString.length()+numberValue);
        }
        return result;
    }*/

    // Other way to do this
    public static List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            // Find delimiter '#'
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }

            // Parse length
            int length = Integer.parseInt(s.substring(i, j));

            // Extract the string
            j++; // move past '#'
            result.add(s.substring(j, j + length));

            // Move index to next encoded string
            i = j + length;
        }

        return result;
    }

}
