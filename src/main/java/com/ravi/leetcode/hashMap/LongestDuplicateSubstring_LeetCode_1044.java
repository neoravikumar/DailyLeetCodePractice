package com.ravi.leetcode.hashMap;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class LongestDuplicateSubstring_LeetCode_1044 {

    static void main() {
        String result = longestDupSubstring("banana");
        System.out.println("Final String is ::>> "+result);

    }

    public static String longestDupSubstring(String s) {
        int n = s.length();
        int[] sa = buildSuffixArray(s);
        int[] lcp = buildLCP(s, sa);

        int maxLen = 0, idx = 0;
        for (int i = 1; i < n; i++) {
            if (lcp[i] > maxLen) {
                maxLen = lcp[i];
                idx = sa[i];
            }
        }
        return s.substring(idx, idx + maxLen);
    }

    private static int[] buildSuffixArray(String s) {
        int n = s.length();
        Integer[] sa = new Integer[n];
        int[] rank = new int[n];

        for (int i = 0; i < n; i++) {
            sa[i] = i;
            rank[i] = s.charAt(i);
        }

        for (int k = 1; k < n; k <<= 1) {
            int kk = k;
            int[] finalRank = rank;
            Arrays.sort(sa, (a, b) -> {
                if (finalRank[a] != finalRank[b]) return finalRank[a] - finalRank[b];
                int ra = a + kk < n ? finalRank[a + kk] : -1;
                int rb = b + kk < n ? finalRank[b + kk] : -1;
                return ra - rb;
            });

            int[] tmp = new int[n];
            tmp[sa[0]] = 0;
            for (int i = 1; i < n; i++) {
                tmp[sa[i]] = tmp[sa[i - 1]]
                        + (rank[sa[i - 1]] != rank[sa[i]]
                        || (sa[i - 1] + kk < n ? rank[sa[i - 1] + kk] : -1)
                        != (sa[i] + kk < n ? rank[sa[i] + kk] : -1) ? 1 : 0);
            }
            rank = tmp;
            if (rank[sa[n - 1]] == n - 1) break;
        }

        return Arrays.stream(sa).mapToInt(i -> i).toArray();
    }

    private static int[] buildLCP(String s, int[] sa) {
        int n = s.length();
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) rank[sa[i]] = i;

        int h = 0;
        int[] lcp = new int[n];
        for (int i = 0; i < n; i++) {
            if (rank[i] > 0) {
                int j = sa[rank[i] - 1];
                while (i + h < n && j + h < n &&
                        s.charAt(i + h) == s.charAt(j + h)) h++;
                lcp[rank[i]] = h;
                if (h > 0) h--;
            }
        }
        return lcp;
    }


    /*
    public static  String longestDupSubstring(String s) {
        Map<String, Integer> map = allPossibleSubString(s);
        String finalString = "";
        List<String> keysList = map.keySet()
                .stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        int currentLength=0, currentCount = 0;
        int globalLength=0, globalCount = 0;


        for(String str:keysList){
            currentLength = str.length();
            currentCount = map.get(str);
            if(currentLength>globalLength && currentCount > 1){
                globalLength = currentLength;
               if(currentCount > globalCount){
                   finalString = str;
               }
            }
        }
        return finalString;
    }

    public static Map<String, Integer> allPossibleSubString(String k){
        Map<String, Integer> result = new HashMap<>();
        int n = k.length();
        for(int start=0;start<n;start++){
            for (int end = start+1;end<=n;end++){
                result.put(k.substring(start,end), result.getOrDefault(k.substring(start,end),0)+1);
            }
        }
        return result;
    }
    */

}
