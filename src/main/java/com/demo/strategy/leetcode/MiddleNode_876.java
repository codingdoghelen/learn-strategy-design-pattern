package com.demo.strategy.leetcode;

import com.demo.strategy.leetcode.ListNode;

public class MiddleNode_876 {
    public static void main(String[] args) {
//
//
//        System.out.println(numberOfSteps(8)); // 4
//
//        System.out.println(numberOfSteps(123)); // 12
//
//        class com.demo.strategy.leetcode.ListNode {
//            int val;
//            com.demo.strategy.leetcode.ListNode next;
//
//            com.demo.strategy.leetcode.ListNode(int val) {
//                this.val = val;
//                this.next = null;
//            }
//        }
//
//
//// Create the nodes
//        com.demo.strategy.leetcode.ListNode node1 = new com.demo.strategy.leetcode.ListNode(1);
//        com.demo.strategy.leetcode.ListNode node2 = new com.demo.strategy.leetcode.ListNode(2);
//        com.demo.strategy.leetcode.ListNode node3 = new com.demo.strategy.leetcode.ListNode(3);
//        com.demo.strategy.leetcode.ListNode node4 = new com.demo.strategy.leetcode.ListNode(4);
//        com.demo.strategy.leetcode.ListNode node5 = new com.demo.strategy.leetcode.ListNode(5);
//
//// Link the nodes together
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//
//// The linked list starts with node1
//        com.demo.strategy.leetcode.ListNode head = node1;
//=
//        System.out.println(middleNode(head)); // 6

    }

    public static ListNode middleNode(ListNode head) {
        // Linked list
        // head
        // middle
        // Two Pointers

        ListNode middle = head;
        ListNode end = head;

        while ((end != null) && (end.next != null)) {
            middle = middle.next;
            end = end.next.next;

        }

        return middle;


    }


}

