package com.ravi.leetcode.linkedlists;

import com.ravi.Utils;

import java.util.PriorityQueue;

public class MergeKSortedLists_LeetCode_23 {
    static void main() {

        int[] original1 = {1, 2, 3,};
        ListNode head = Utils.createLinkedList(original1);
        ListNode[] abc = {head};
        ListNode result = mergeKLists(abc);
        System.out.println(result.toString());
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                (a,b) -> Integer.compare(a.val,b.val)
        );
        for(ListNode list : lists){
            if(list!=null){
                pq.add(list);
            }
        }
        ListNode result = null;
        ListNode resultEnd = null;
        while(!pq.isEmpty()){
            ListNode smallest = pq.poll();
            if(result == null){
                result = smallest;
            } else {
                resultEnd.next = smallest;
            }
            resultEnd = smallest;
            if(smallest.next != null){
                pq.add(smallest.next);
            }

        }
        return result;
    }
}
