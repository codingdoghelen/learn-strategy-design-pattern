package com.demo.strategy.leetcode.linkedList;


public class LinkedList {
    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }


    private Node first;
    private Node last;

    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // contains
    // indexOf

    public static void main(String[] args) {

//        LinkedList<Integer> linkedList = new LinkedList<>();
//        linkedList.add(10);


        LinkedList x = new LinkedList();
        x.addFirst(5);
        x.addFirst(10);
        x.addFirst(15);

//        System.out.println(x);

    }

    public void addLast(int item) {
        Node node = new Node(item);

        if (first == null) {
            first = last=node;
        } else {
            last.next = node;
            last = node;
        }
    }


    public void addFirst(int item) {

        // 1. Create Node Class with value and next - also create constructor
        // 2. Create variables first and last
        // 3. Check if first has values
        // 4. If no values then first = last = node
        // 5. If have values then last.next = node || node.next = first
        // 6. Assign first / last to node

        Node node = new Node(item);

        if (first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }

    }


}
