package com.ravi.leetcode.linkedlists;

import com.ravi.Utils;

import java.util.ArrayList;
import java.util.List;

public class ReorderList_LeetCode_143 {

    static void main() {

        int[] original1 = {1, 2, 3, 4, 5};
        ListNode head = Utils.createLinkedList(original1);
        reorderList(head);

    }
    public static void reorderList(ListNode head) {

        if(head == null || head.next == null ){
            return;
        }

        // find the middle of the list
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }


        ListNode secondHead = slow.next;
        slow.next=null;

        // Reverse the second half of the lest ( middle to last )
        ListNode prev = null;
        ListNode curr = secondHead;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr= nextNode;
        }

        // Merge list now
        ListNode t1=head;
        ListNode t2 = prev;
        while(t2!=null){
            ListNode m1 = t1.next;
            ListNode m2 = t2.next;
            t1.next = t2;
            t2.next = m1;
            t1 = m1;
            t2 = m2;
        }

    }
}
