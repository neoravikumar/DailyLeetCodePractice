package com.ravi.leetcode.linkedlists;


import com.ravi.Utils;

public class LinkedListReverser {

 /*   static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }*/

    // Function to reverse the linked list (iterative approach)
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next; // Store next ListNode
            current.next = prev; // Reverse current ListNode's pointer
            prev = current;      // Move 'prev' to current ListNode
            current = next;      // Move 'current' to next ListNode
        }
        return prev; // 'prev' is the new head of the reversed list
    }



    // Helper function to compare linked list with expected array
    public boolean validateReversal(ListNode head, int[] expected) {
        ListNode current = head;
        for (int i = 0; i < expected.length; i++) {
            if (current == null || current.val != expected[i]) {
                return false;
            }
            current = current.next;
        }
        return current == null; // Ensure no extra ListNodes
    }

    public static void main(String[] args) {
        LinkedListReverser reverser = new LinkedListReverser();

        // --- Test Cases ---

        // Test Case 1: Standard case (multiple elements)
        int[] original1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 4, 3, 2, 1};
        ListNode head1 = Utils.createLinkedList(original1);
        ListNode reversedHead1 = reverser.reverse(head1);
        System.out.println("Test Case 1: Standard List");
        System.out.print("Reversed List: ");
        Utils.printList(reversedHead1);
        System.out.println("Validation: " + (reverser.validateReversal(reversedHead1, expected1) ? "PASSED" : "FAILED"));

        // Test Case 2: Empty list
        int[] original2 = {};
        int[] expected2 = {};
        ListNode head2 = Utils.createLinkedList(original2);
        ListNode reversedHead2 = reverser.reverse(head2);
        System.out.println("\nTest Case 2: Empty List");
        System.out.print("Reversed List: ");
        Utils.printList(reversedHead2);
        System.out.println("Validation: " + (reverser.validateReversal(reversedHead2, expected2) ? "PASSED" : "FAILED"));

        // Test Case 3: Single element list
        int[] original3 = {10};
        int[] expected3 = {10};
        ListNode head3 = Utils.createLinkedList(original3);
        ListNode reversedHead3 = reverser.reverse(head3);
        System.out.println("\nTest Case 3: Single Element List");
        System.out.print("Reversed List: ");
        Utils.printList(reversedHead3);
        System.out.println("Validation: " + (reverser.validateReversal(reversedHead3, expected3) ? "PASSED" : "FAILED"));

        // Test Case 4: Two elements list
        int[] original4 = {1, 2};
        int[] expected4 = {2, 1};
        ListNode head4 = Utils.createLinkedList(original4);
        ListNode reversedHead4 = reverser.reverse(head4);
        System.out.println("\nTest Case 4: Two Elements List");
        System.out.print("Reversed List: ");
        Utils.printList(reversedHead4);
        System.out.println("Validation: " + (reverser.validateReversal(reversedHead4, expected4) ? "PASSED" : "FAILED"));
    }
}

