package Algorithms.Implementation;

import java.util.Scanner;

public class AppendandDelete {

	static String appendAndDelete(String s, String t, int k) {
		/* Case 1 - Empty String */
		if (k >= s.length() + t.length()) {
			return "Yes";
		}

		/* Case 2 */
		int i = 0; // represents index of 1st non-matching character
		for (; i < s.length() && i < t.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				break;
			}
		}
		int minOperations = (s.length() - i) + (t.length() - i);
		return k >= minOperations && (k - minOperations) % 2 == 0 ? "Yes" : "No";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String t = scanner.next();
		int k = scanner.nextInt();
		scanner.close();

		System.out.println(appendAndDelete(s, t, k));
	}

}
