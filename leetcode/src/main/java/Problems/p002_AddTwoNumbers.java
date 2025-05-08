package Problems;


import java.math.BigInteger;

public class p002_AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        do {
            sb1.append(l1.val);
            l1 = l1.next;
        } while (l1 != null);

        do {
            sb2.append(l2.val);
            l2 = l2.next;
        } while (l2 != null);

        sb1.reverse();
        sb2.reverse();

        sb3.append(new BigInteger(sb1.toString()).add(new BigInteger(sb2.toString())));
        sb3.reverse();

        ListNode head = null;
        ListNode tail = null; // Keep track of the last node

        for (char c : sb3.toString().toCharArray()) {
            ListNode newNode = new ListNode(Character.getNumericValue(c));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode; // Update the tail
            }
        }

        return head;
    }


    static ListNode getNextListNode(ListNode listNode) {
        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        l1.val = 2;

        ListNode l11 = new ListNode();
        l11.val = 4;
        l1.next = l11;

        ListNode l111 = new ListNode();
        l111.val = 3;
        l11.next = l111;

        ListNode l2 = new ListNode();
        l2.val = 5;

        ListNode l22 = new ListNode();
        l22.val = 6;
        l2.next = l22;

        ListNode l222 = new ListNode();
        l222.val = 4;
        l22.next = l222;

        System.out.println(addTwoNumbers(l1, l2));
    }

    public static class ListNode {
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
