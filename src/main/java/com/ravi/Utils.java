package com.ravi;

import com.ravi.leetcode.linkedlists.LinkedListReverser;
import com.ravi.leetcode.linkedlists.ListNode;

public class Utils {

    // Helper method to calculate the sum of squares of digits inline
    private static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Helper function to create a linked list from an array
    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
}
