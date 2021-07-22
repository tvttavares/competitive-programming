package DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> maxStack = new Stack<>();
		maxStack.push(0);
		int ntest = scan.nextInt();

		while (ntest-- > 0) {
			int num = scan.nextInt();
			if (num == 1) {
				int n = scan.nextInt();
				stack.push(n);
				if (stack.peek() >= maxStack.peek()) {
					maxStack.push(n);
				}
			}
			if (num == 2) {
				if (stack.peek().equals(maxStack.peek())) {
					maxStack.pop();
				}
				stack.pop();
			}
			if (num == 3) {
				System.out.println(maxStack.peek());
			}
		}
		scan.close();
	}

}
