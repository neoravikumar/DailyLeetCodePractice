package com.ravi.leetcode.arrays;

// Restore Finishing Order
// https://leetcode.com/problems/restore-finishing-order/description/?envType=problem-list-v2&envId=array

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 You are given an integer array order of length n and an integer array friends.

 order contains every integer from 1 to n exactly once, representing the IDs of the participants of a race in their finishing order.
 friends contains the IDs of your friends in the race sorted in strictly increasing order. Each ID in friends is guaranteed to appear in the order array.
 Return an array containing your friends' IDs in their finishing order.



 Example 1:

 Input: order = [3,1,2,5,4], friends = [1,3,4]

 Output: [3,1,4]

 Explanation:

 The finishing order is [3, 1, 2, 5, 4]. Therefore, the finishing order of your friends is [3, 1, 4].
 */
public class RestoreFinishingOrder {
    static void main() {
        int[] arr = {3,1,2,5,4};
        int[] arr2 = {1,3,4};
        int[] result = recoverOrder(arr,arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] resultArray = new int[friends.length];
        //Set<Integer> fSet = new HashSet<>();
        Set<Integer> fSet = Arrays.stream(friends).boxed().collect(Collectors.toSet());
        int index=0;
        for(int i=0;i<order.length;i++){
            if(fSet.contains(order[i])){
                resultArray[index]=order[i];
                index +=1;
            }
            if (index == friends.length) {
                break;
            }
        }
        return resultArray;
    }
}
