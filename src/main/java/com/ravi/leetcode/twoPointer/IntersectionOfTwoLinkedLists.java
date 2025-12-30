package com.ravi.leetcode.twoPointer;

// https://leetcode.com/problems/intersection-of-two-linked-lists/description/?envType=problem-list-v2&envId=two-pointers
//Intersection of Two Linked Lists

import com.ravi.leetcode.linkedlists.ListNode;
import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 */
public class IntersectionOfTwoLinkedLists {
    static void main() {
        // creation of first list: 10 -> 15 -> 30
        ListNode head1 = new ListNode(10);
        head1.next = new ListNode(15);
        head1.next.next = new ListNode(30);

        // creation of second list: 3 -> 6 -> 9 -> 15 -> 30
        ListNode head2 = new ListNode(3);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(9);

        // 15 is the intersection point
        head2.next.next.next = head1.next;

        ListNode interPt = getIntersectionNode(head1, head2);

        if (interPt == null)
            System.out.println("-1");
        else
            System.out.println(interPt.val);

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /*
        // USING MAP APPROACH
        Set<ListNode> aSet = new HashSet<>();
        ListNode curr = headA;
        while (curr != null) {
            aSet.add(curr);
            curr = curr.next;
        }
        ListNode bCurr = headB;
        while (bCurr != null) {
            if(aSet.contains(bCurr)) {
                return bCurr;
            }else{
                bCurr = bCurr.next;
            }
        }
        return null; */

        // USING TWO POINTER

        ListNode ptrA = headA, ptrB = headB;
        while (ptrA != ptrB) { // loop until we found the first common node
            ptrA = ptrA == null ? headB : ptrA.next; // once we're done with A, move to B
            ptrB = ptrB == null ? headA : ptrB.next; // once we're done with B, move to A
        }
        return ptrA;

    }
}
