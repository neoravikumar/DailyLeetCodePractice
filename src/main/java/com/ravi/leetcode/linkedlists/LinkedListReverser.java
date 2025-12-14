package com.ravi.leetcode.linkedlists;

public class LinkedListReverser {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse the linked list (iterative approach)
    public Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current;      // Move 'prev' to current node
            current = next;      // Move 'current' to next node
        }
        return prev; // 'prev' is the new head of the reversed list
    }

    // Helper function to print the linked list
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Helper function to create a linked list from an array
    public Node createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper function to compare linked list with expected array
    public boolean validateReversal(Node head, int[] expected) {
        Node current = head;
        for (int i = 0; i < expected.length; i++) {
            if (current == null || current.data != expected[i]) {
                return false;
            }
            current = current.next;
        }
        return current == null; // Ensure no extra nodes
    }

    public static void main(String[] args) {
        LinkedListReverser reverser = new LinkedListReverser();

        // --- Test Cases ---

        // Test Case 1: Standard case (multiple elements)
        int[] original1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 4, 3, 2, 1};
        Node head1 = reverser.createLinkedList(original1);
        Node reversedHead1 = reverser.reverse(head1);
        System.out.println("Test Case 1: Standard List");
        System.out.print("Reversed List: ");
        reverser.printList(reversedHead1);
        System.out.println("Validation: " + (reverser.validateReversal(reversedHead1, expected1) ? "PASSED" : "FAILED"));

        // Test Case 2: Empty list
        int[] original2 = {};
        int[] expected2 = {};
        Node head2 = reverser.createLinkedList(original2);
        Node reversedHead2 = reverser.reverse(head2);
        System.out.println("\nTest Case 2: Empty List");
        System.out.print("Reversed List: ");
        reverser.printList(reversedHead2);
        System.out.println("Validation: " + (reverser.validateReversal(reversedHead2, expected2) ? "PASSED" : "FAILED"));

        // Test Case 3: Single element list
        int[] original3 = {10};
        int[] expected3 = {10};
        Node head3 = reverser.createLinkedList(original3);
        Node reversedHead3 = reverser.reverse(head3);
        System.out.println("\nTest Case 3: Single Element List");
        System.out.print("Reversed List: ");
        reverser.printList(reversedHead3);
        System.out.println("Validation: " + (reverser.validateReversal(reversedHead3, expected3) ? "PASSED" : "FAILED"));

        // Test Case 4: Two elements list
        int[] original4 = {1, 2};
        int[] expected4 = {2, 1};
        Node head4 = reverser.createLinkedList(original4);
        Node reversedHead4 = reverser.reverse(head4);
        System.out.println("\nTest Case 4: Two Elements List");
        System.out.print("Reversed List: ");
        reverser.printList(reversedHead4);
        System.out.println("Validation: " + (reverser.validateReversal(reversedHead4, expected4) ? "PASSED" : "FAILED"));
    }
}

