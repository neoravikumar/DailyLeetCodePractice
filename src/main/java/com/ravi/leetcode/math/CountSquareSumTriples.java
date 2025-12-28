package com.ravi.leetcode.math;

// 1925. Count Square Sum Triples
// https://leetcode.com/problems/count-square-sum-triples/description/?envType=daily-question&envId=2025-12-01
public class CountSquareSumTriples {
    static void main() {
        int result = countTriples(5);
        System.out.println(result);

    }
    public static int countTriples(int n) {
        int count =0;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int k = i*i + j*j;
                double doubleSqrt = Math.sqrt(k);
                int check = (int) Math.sqrt(k);
                if(doubleSqrt == check && check<=n){
                    count +=1;
                }
            }
        }
        return count;
    }
}
