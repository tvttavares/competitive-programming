package Languages.Java.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

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
		return stack.isEmpty() ? "true" : "false";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			System.out.println(isBalancedBrackets(input));
		}

		sc.close();

	}
}
