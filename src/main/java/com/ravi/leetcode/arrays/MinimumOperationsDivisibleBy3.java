package com.ravi.leetcode.arrays;

/*
* LeetCode #3190 - Find Minimum Operations to Make All Elements Divisible by Three
* Topic: Array
* Time: O(n)
* Space: O(1)
*/
public class MinimumOperationsDivisibleBy3 {
    static void main() {

    }
    public int minimumOperations(int[] nums) {
        int opr = 0;
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            int rem = k%3;
            if(rem!=0){
                if((rem+1)%3==0 || (rem-1)%3==0){
                    opr++;
                }

            }
        }
        return opr;
    }
}
