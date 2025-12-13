package com.ravi.leetcode.math;

public class BinaryOperations {

    static void main() {
        long n=2147483645;
        int sum=0;
        String binary = Long.toBinaryString(n);
        for(char input : binary.toCharArray()){
            if(input=='1'){
                sum +=1;
            }
        }

        System.out.println(sum);
    }
}
