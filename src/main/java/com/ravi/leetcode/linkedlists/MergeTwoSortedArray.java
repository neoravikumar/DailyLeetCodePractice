package com.ravi.leetcode.linkedlists;

public class MergeTwoSortedArray {
    static void main() {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode head = null;
        ListNode tail = null;

        while (list1 != null && list2 != null) {
            ListNode temp = null;
            if (list1.val <= list2.val) {
                temp = list1;
                list1 = list1.next;
            } else {
                temp = list2;
                list2 = list2.next;
            }
            temp.next = null;
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        if (list1 == null) {
            tail.next = list2;
        }
        if (list2 == null) {
            tail.next = list1;
        }
        return head;
    }
}
