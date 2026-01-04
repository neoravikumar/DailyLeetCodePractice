package com.ravi.leetcode.arrays;

public class ApplyOperationsToAnArray {
    static void main() {
        //int[] input = {1,2,2,1,1,0};
        int[] input = {0,1};
        int[] result = applyOperations(input);
        System.out.println(result);

    }
    public static int[] applyOperations(int[] nums) {
        int n = nums.length;

        for(int k=0;k<n-1;k++){
            if(nums[k] == nums[k+1] &&  nums[k] != 0){
                nums[k] *= 2;
                nums[k+1] = 0;
            }
        }
        // Shift zero to last
        int nonZeroIdx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // Swap or just assign to move non-zero element forward
                int temp = nums[i];
                nums[i] = nums[nonZeroIdx];
                nums[nonZeroIdx] = temp;
                nonZeroIdx++;
            }
        }
        return nums;
    }
}
