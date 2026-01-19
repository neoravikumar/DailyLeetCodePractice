package com.ravi.leetcode.twoPointer;

public class PartitionArrayAccordingToGivenPivot {
    static void main() {
            int[] result = pivotArray(new int[]{-3,4,3,2},2);
        System.out.println(result);
    }
    public static int[] pivotArray(int[] nums, int pivot) {



        /*int[] result = new int[nums.length];
        int n = nums.length-1;
        int end=n-1;
        int mid = n/2;
        for(int start=0;start<=end;start++,end--){
            if(nums[start]<pivot || nums[end]<pivot){
                int p=start;
                while(nums[p]>0){
                    p++;
                }
                result[p] = nums[start];
                int k=end;
                while(nums[])
            }
            else if(nums[start]==pivot){
                int p = mid;
                while(nums[p]>0){
                    p++;
                }
                result[p] = nums[start];
            }else if(nums[start]>pivot){
                int p = mid + start;
                while(nums[p]>0 && p<end){
                    p++;
                }
                result[p] = nums[start];

            }
            else{
                int p=start;
                while(nums[p]>0){
                    p++;
                }
                result[p] = nums[start];
            }

        }
        return result;*/
        return null;
    }
}
