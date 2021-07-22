package DataStructures.Trees.BinarySearchTreeInsertion;

import java.util.Scanner;

class Node {
	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class BinarySearchTreeInsertion {

	public static void preOrder(Node root) {

		if (root == null)
			return;

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	/*
	 * Node is defined as : class Node int data; Node left; Node right;
	 * 
	 */

	static Node insert(Node root, int value) {
		if (root == null) {
			Node node = new Node(value);
			node.left = null;
			node.right = null;
			root = node;
		} else if (root.data > value) {
			root.left = insert(root.left, value);
		}

		else if (root.data < value) {
			root.right = insert(root.right, value);
		}
		return root;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		Node root = null;
		while (t-- > 0) {
			int data = scan.nextInt();
			root = insert(root, data);
		}
		scan.close();
		preOrder(root);
	}
}