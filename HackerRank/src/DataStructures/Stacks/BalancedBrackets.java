package DataStructures.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static String isBalancedBrackets(String value) {
		Stack<Character> stack = new Stack<>();
		char upperElement = 0;
		for (int i = 0; i < value.length(); i++) {
			if (!stack.isEmpty()) {
				upperElement = stack.peek();
			}
			stack.push(value.charAt(i));
			if (!stack.isEmpty() && stack.size() > 1) {
				if ((upperElement == '[' && stack.peek() == ']') || (upperElement == '{' && stack.peek() == '}')
						|| (upperElement == '(' && stack.peek() == ')')) {
					stack.pop();
					stack.pop();
				}
			}
		}
		return stack.isEmpty() ? "YES" : "NO";
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String result;

		for (int i = 0; i < n; i++) {
			String s = scan.next();
			result = isBalancedBrackets(s);
			System.out.println(result);
		}
		scan.close();

	}
}
