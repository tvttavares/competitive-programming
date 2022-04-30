package Arcade.Intro;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseInParenthesesClass {

    public static void main(String[] args) {
        String a = "foo(bar(baz))blim";
//        int[] a = "foobazrabblim";

        System.out.println(solution(a));
    }

    static String solution(String inputString) {
        Stack<Character> stack = new Stack<>();
        for (char c : inputString.toCharArray()) {
            if (c == ')') {
                Queue<Character> queue = new LinkedList<>();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    queue.add(stack.pop());
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                while (!queue.isEmpty()) {
                    stack.push(queue.remove());
                }
            } else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }

}
