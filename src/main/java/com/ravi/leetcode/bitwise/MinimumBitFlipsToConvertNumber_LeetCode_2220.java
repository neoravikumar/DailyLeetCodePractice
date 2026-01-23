package com.ravi.leetcode.bitwise;

import java.math.BigInteger;

public class MinimumBitFlipsToConvertNumber_LeetCode_2220 {
    static void main() {
        int start = 10, goal = 7;
        int result =  minBitFlips(start,goal);

        System.out.println(result);



    }
    public static int minBitFlips(int start, int goal) {

        int k = start ^ goal;
        BigInteger s_start = new BigInteger(String.valueOf(k));
        return s_start.bitCount();

        /*String s_start = new BigInteger(String.valueOf(start)).toString(2);
        System.out.println(s_start);
        String s_goal = new BigInteger(String.valueOf(goal)).toString(2);
        System.out.println(s_goal);
        int len = s_start.length()-1;
        int glen = s_goal.length()-1;
        int change = 0;

        for(int i = len; i>=0;i-- ){
            if( glen >= 0 && s_start.charAt(i) == s_goal.charAt(glen)){
                glen--;
            }else{
                change++;
                glen--;
            }
            if(glen<0 && s_start.charAt(i)==1){
                change++;
            }

        }

        return change; */
    }
}
