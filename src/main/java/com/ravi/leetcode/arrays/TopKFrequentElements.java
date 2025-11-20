package com.ravi.leetcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    static void main() {
        //int[] input = {1,1,1,2,2,3};
        // int[] input = {1,2,1,2,1,2,3,1,3,3,3,3,3,3,3,3,3,3,2};
        int[] input = {-1, -1};
        int k=1;
        int[] result = topKFrequent(input,k);
        System.out.println(result);
    }

    public static int[] topKFrequent(int[] nums, int k) {

        if(k==1 && nums.length==1){
            return nums;
        }

        Map<Integer, Integer> fMap = new HashMap<>();
        for(int n: nums){
            fMap.put(n, fMap.getOrDefault(n, 0)+1);
        }
        List<Integer>[] bucket = new List[nums.length +1];
        for(int key : fMap.keySet()){
            int freq = fMap.get(key);
            if(bucket[freq]== null) bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=nums.length-1;i>0 && res.size()<k;i--){
            if(bucket[i]!=null) {
                res.addAll(bucket[i]);
            }
        }

        List<Integer> result = res.subList(0,k);
        int[] finalResult = new int[k];
        for (int i=0;i<k;i++){
            int f = result.get(i);
            finalResult[i] = f;

        }
        return finalResult;
    }

}
