package Algorithms.Warmup;

import java.util.Scanner;

public class SolveMeFirst {

	static int solveMeFirst(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		in.close();

		int sum = solveMeFirst(a, b);
		System.out.println(sum);
	}
}
