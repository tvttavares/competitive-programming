package DataStructures.Trees.TreeTopView;

import java.util.ArrayDeque;
import java.util.Queue;
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

class TreeTopView {

	/*
	 * 
	 * class Node int data; Node left; Node right;
	 */
	public static void topView(Node root) {
		int MAX = 500; // Otherwise, MAX=getNodeCount(root);
		int[] top = new int[MAX * 2];
		Queue<Object[]> queue = new ArrayDeque<>();
		queue.add(new Object[] { root, MAX });
		while (!queue.isEmpty()) {
			Object[] array = queue.remove();
			Node node = (Node) array[0];
			Integer order = (Integer) array[1];
			if (node == null)
				continue;

			if (top[order] == 0)
				top[order] = node.data;
			queue.add(new Object[] { node.left, order - 1 });
			queue.add(new Object[] { node.right, order + 1 });
		}

		for (int data : top)
			if (data != 0)
				System.out.print(data + " ");
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
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
		topView(root);
	}
}