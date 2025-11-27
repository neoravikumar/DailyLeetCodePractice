package com.ravi.leetcode.arrays;

// Leet Code https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class TwoSum11 {
    static void main() {
        int[] numbers = {2,7,11,15};
                int target = 9;
        TwoSum11 twoSum2 = new TwoSum11();
        int[] result = twoSum2.twoSumOptimal(numbers, target);
        System.out.println(result);
    }
    // Brute Force
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] result = new int[2];
        if(n<=1){
            return result;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(numbers[i]+numbers[j]==target){
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
            }
        }

        return  result;
    }

    // another Approach
    public int[] twoSumOptimal(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}
