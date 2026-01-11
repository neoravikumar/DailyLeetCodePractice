package com.ravi.leetcode.arrays;

// Minimum Number of Operations to Move All Balls to Each Box - LeetCode 1769
public class Leetcode1769 {
    static void main() {

        int[] result = minOperations("001011");
        System.out.println(result);

    }
    public static int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        int ball=0;
        int moves=0;
        for(int i=0;i<boxes.length();i++){
            result[i] = moves;
            if(boxes.charAt(i)=='1'){
                ball++;
            }
            moves +=ball;
        }
        ball=0;
        moves=0;
        for(int i=boxes.length()-1;i>=0;i--){
            result[i] += moves;
            if(boxes.charAt(i)=='1'){
                ball++;
            }
            moves +=ball;
        }
        return result;
    }
}
