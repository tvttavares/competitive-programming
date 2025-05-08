package Problems;

import java.math.BigInteger;

public class p445_AddTwoNumbersII {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();

        ListNode head = null;
        ListNode tail = null;
        do {
            if (head == null) {
                head = l1;
                tail = l1;
            }
            sb1.append(tail.val);
            tail = tail.next;

        } while (tail != null);

        head = null;
        tail = null;
        do {
            if (head == null) {
                head = l2;
                tail = l2;
            }
            sb2.append(tail.val);
            tail = tail.next;

        } while (tail != null);


        BigInteger b1 = new BigInteger(sb1.toString());
        BigInteger b2 = new BigInteger(sb2.toString());

        sb3.append(b1.add(b2));


        head = null;
        tail = null;
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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);

        ListNode l11 = new ListNode(4);
        l1.next = l11;

        ListNode l111 = new ListNode(3);
        l11.next = l111;

        ListNode l2 = new ListNode(5);

        ListNode l22 = new ListNode(6);
        l2.next = l22;

        ListNode l222 = new ListNode(4);
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
