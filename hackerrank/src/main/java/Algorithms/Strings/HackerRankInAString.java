package Algorithms.Strings;

import java.util.Scanner;

public class HackerRankInAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int queries = scan.nextInt();

		while (queries-- > 0) {
			System.out.println(checkIfIsHacker(scan.next()));
		}
		scan.close();
	}

	private static String checkIfIsHacker(String s) {
		String str = "hackerrank";
		if (s.length() < str.length()) {
			return "NO";
		}
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (j < str.length() && s.charAt(i) == str.charAt(j)) {
				j++;
			}
		}
		return (j == str.length() ? "YES" : "NO");
	}
}
