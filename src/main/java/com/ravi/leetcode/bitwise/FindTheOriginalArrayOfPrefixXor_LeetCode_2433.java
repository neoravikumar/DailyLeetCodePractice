package com.ravi.leetcode.bitwise;

import java.util.Arrays;

public class FindTheOriginalArrayOfPrefixXor_LeetCode_2433 {
    static void main() {
        int[] input = new int[]{5,2,0,3,1};
        int[] result = findArray(input);
        System.out.println(Arrays.toString(result));
        /*int n = 3^1;
        System.out.print(n+",");
        int nn = n^7;
        System.out.print(nn+",");
        int nnn = nn^10;
        System.out.print(+nnn+",");
        int r = nnn^11;
        System.out.print(r+",");*/


    }
    public static int[] findArray(int[] pref) {
        int[] result = new int[pref.length];
        result[0] = pref[0];
        for(int i =1;i<pref.length;i++){
            int n = pref[i-1] ^ pref[i];
            result[i] = n;
        }

        return result;
    }
}
