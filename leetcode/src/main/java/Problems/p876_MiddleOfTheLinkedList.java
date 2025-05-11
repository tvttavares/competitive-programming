package Problems;

public class p876_MiddleOfTheLinkedList {


    public static ListNode middleNode(ListNode head) {
        int cont = 0;
        ListNode tmp = head;

        while (tmp != null) {
            cont++;
            tmp = tmp.next;
        }

        int mid = cont / 2;
        tmp = head;
        for (int i = 0; i < mid; i++) {
            tmp = tmp.next;
        }

        return tmp;
    }

//    public static ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);

        System.out.println(middleNode(n1));
    }


    /**
     * Definition for singly-linked list.
     **/
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
