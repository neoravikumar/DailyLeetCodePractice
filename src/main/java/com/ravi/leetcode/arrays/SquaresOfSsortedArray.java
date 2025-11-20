package com.ravi.leetcode.arrays;

public class SquaresOfSsortedArray {
    static void main() {
        //int[] input =  {-4,-1,0,3,10};
        int[] input2 =  {-7,-3,2,3,11};
        int[] result = sortedSquares(input2);
        System.out.println("Result>>>"+result);

    }
    public static int[] sortedSquares(int[] nums) {
        int N = nums.length-1;
        int start =0 , next=1;
        for(int i=0;i<=N;i++){
            nums[i] = nums[i]*nums[i];
        }
        while(start < N){
            if(nums[start]>nums[next]){
                swap(nums, start, next);
            }else{
                next++;
                if(next>N){
                    next =N;
                }
            }
            if(next == N){
                start ++;
                next = start +1;
            }

        }
        return nums;
    }

    public static  void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
