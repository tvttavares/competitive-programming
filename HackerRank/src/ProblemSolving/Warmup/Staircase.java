package ProblemSolving.Warmup;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(" ");
		}
		for (int i = 1; i <= n; i++) {
			sb.replace(sb.length() - i, sb.length() - i + 1, "#");
			System.out.println(sb);
		}
	}
}
