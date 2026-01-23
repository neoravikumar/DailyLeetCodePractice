package com.ravi.leetcode.bitwise;

public class XOROperationInAnArray {
    static void main() {
        int result = xorOperation(5,0);
        System.out.println(result);
    }
    public static int xorOperation(int n, int start) {
        int result = 0;
        for(int i=0;i<n;i++){
            int num = start +2 * i;
            result ^= num;
        }
        return result;
    }
}
