package com.ravi.leetcode.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {

    static void main() {
        String s = "baa";
        String p="aa";
        List<Integer> result = findAnagrams(s,p);
        System.out.println(result);
    }

    public  static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pFreq = new int[26];
        int[] winFreq = new int[26];

        // Build freq for p
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {

            // Add current char to window
            winFreq[s.charAt(i) - 'a']++;

            // Remove the char that goes out of window
            if (i >= k) {
                winFreq[s.charAt(i - k) - 'a']--;
            }

            // Compare after the window has reached size k
            if (i >= k - 1 && Arrays.equals(winFreq, pFreq)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }


}
