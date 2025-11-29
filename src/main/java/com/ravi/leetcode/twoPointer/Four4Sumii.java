package com.ravi.leetcode.twoPointer;

import java.util.HashMap;
import java.util.Map;

public class Four4Sumii {

    static void main() {

        int[] nums1 =  {1,2};
        int[] nums2 =  {-2,-1};
        int[] nums3 =  {-1,2};
        int[] nums4 =  {0,2};

        int result = fourSumCount(nums1, nums2,nums3,nums4);
        System.out.println(result);
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        /*int i= nums1.length;
        int j= nums2.length;
        int k= nums3.length;
        int l= nums4.length;*/

        int count = 0;
        /* Brute force * /
        for(int p=0;p<i;p++){
            for(int q=0;q<j;q++){
                for(int r=0;r<k;r++){
                    for(int s=0;s<l;s++){
                        int sum = nums1[p]+nums2[q]+nums3[r]+nums4[s];
                        if(sum==0){
                            counter +=1;
                        }
                    }
                }
            }
        } */

        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Store sums of nums1 + nums2 in map
        for (int a : nums1) {
            for (int b : nums2) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }

        //int count = 0;

        // Step 2: For nums3 + nums4, check if -(c + d) exists
        for (int c : nums3) {
            for (int d : nums4) {
                int target = - (c + d);
                if (map.containsKey(target)) {
                    count += map.get(target);
                }
            }
        }

        return count;
    }
}
