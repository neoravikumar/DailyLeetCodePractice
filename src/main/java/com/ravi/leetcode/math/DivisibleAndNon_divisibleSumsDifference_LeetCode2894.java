package com.ravi.leetcode.math;

public class DivisibleAndNon_divisibleSumsDifference_LeetCode2894 {
    static void main() {
        int result = differenceOfSums(10,3);
        System.out.println(result);

    }
    public static int differenceOfSums(int n, int m) {
        int divisibleByM = 0;
        int notDivisibleByM = 0;
        for(int i=1; i<=n;i++){
            if(i%m==0){
                divisibleByM +=i;
            }else{
                notDivisibleByM += i;
            }

        }
        return notDivisibleByM - divisibleByM;
    }
}
