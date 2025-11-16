package com.ravi.leetcode.arrays;

public class ContainsDuplicate {

    static void main() {
        int[] input = {1,1,1,3,3,4,3,2,4,2};
        boolean result = containsDuplicate(input);


    }

    public static boolean containsDuplicate(int[] nums) {
        int result = 0;
        // Brute force approach
        int N = nums.length;
        /*for(int n = 0;n<N;n++){
            for(int k=n+1;k<N;k++){
                if(nums[n]==nums[k]){
                    return true;
                }
            }
        }*/

        // Using Set
        /*Set<Integer> set = new HashSet<>();
        for(int i=0;i<N;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }*/
        // using XOR

        for (int i = 0; i < N; i++) {
            result ^= nums[i];
        }
        return result != 0;
    }
}
