import ListNode.ListNode;

public class MiddleNode_876 {
    public static void main(String[] args) {
//
//
//        System.out.println(numberOfSteps(8)); // 4
//
//        System.out.println(numberOfSteps(123)); // 12
//
//        class ListNode {
//            int val;
//            ListNode next;
//
//            ListNode(int val) {
//                this.val = val;
//                this.next = null;
//            }
//        }
//
//
//// Create the nodes
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//
//// Link the nodes together
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//
//// The linked list starts with node1
//        ListNode head = node1;
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

