package Challenges30DaysCode;

import java.util.Scanner;

class Node2 {
	int data;
	Node2 next;

	Node2(int d) {
		data = d;
		next = null;
	}
}

public class Day15LinkedList {

	public static Node2 insert(Node2 head, int data) {
		// Complete this method
		if (head == null) {
			return new Node2(data);
		} else {
			Node2 n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = new Node2(data);
			return head;
		}
	}

	public static void display(Node2 head) {
		Node2 start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node2 head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}