package com.ravi.leetcode.linkedlists;

import com.ravi.Utils;

public class RemoveNthNodeFromEndOfList {
    static void main() {
        int[] original1 = {1, 2, 3,};
        ListNode head = Utils.createLinkedList(original1);
        ListNode result = removeNthFromEnd(head,1);
        System.out.println(result);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next==null){
            return head;
        }
        int tcount = 0;
        ListNode temp = head;
        while(temp != null){
            tcount++;
            temp = temp.next;
        }
        int listSize = tcount-n;
        ListNode tNode = head;
        int t = 0;
        ListNode prev=null;
        while(tNode != null && t<tcount){
            if(t==listSize){
                ListNode k = tNode.next;
                prev.next=k;
            }
            prev = tNode;
            tNode = tNode.next;
            t++;
        }
        return head;
    }
}
