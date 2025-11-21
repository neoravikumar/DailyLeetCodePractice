package com.ravi.leetcode.slidingWindow;

import java.util.*;

public class LengthOfLongestSubstring {
    static void main() {

        String input = "pwwkew";
        int result = lengthOfLongestSubstring(input);
        System.out.println(result);


    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> uniqueWindowMap = new HashSet<>();
        int start = 0, end = 0, ws = 0;

        for (; end < s.length(); end++) {
            while (uniqueWindowMap.contains(s.charAt(end))) {
                uniqueWindowMap.remove(s.charAt(start));
                start++;
            }
            uniqueWindowMap.add(s.charAt(end));
            ws = Math.max(ws, end - start + 1);
        }
        return ws;
    }
}
