package com.ravi.leetcode;

public class FindTheMiddleIndexInArray {
    static void main() {
        int[] arr = {2,3,-1,8,4};
        int result = findMiddleIndex(arr);
        System.out.println(result);
    }
    public static int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for(int k: nums){
            totalSum += k;
        }

        for(int i=0;i<nums.length;i++){
            if(totalSum - nums[i] == 2*leftSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
