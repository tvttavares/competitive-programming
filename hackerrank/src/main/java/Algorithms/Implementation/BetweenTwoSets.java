package Algorithms.Implementation;

import java.util.Scanner;

public class BetweenTwoSets {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		int[] b = new int[m];
		for (int j = 0; j < m; j++) {
			b[j] = scan.nextInt();
		}
		scan.close();

		int f = lcm(a);
		int l = gcd(b);
		int count = 0;
		for (int i = f, j = 2; i <= l; i = f * j, j++) {
			if (l % i == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static int gcd(int a, int b) {
		while (b > 0) {
			int temp = b;
			b = a % b; // % is remainder
			a = temp;
		}
		return a;
	}

	private static int gcd(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++) {
			result = gcd(result, input[i]);
		}
		return result;
	}

	private static int lcm(int a, int b) {
		return a * (b / gcd(a, b));
	}

	private static int lcm(int[] input) {
		int result = input[0];
		for (int i = 1; i < input.length; i++) {
			result = lcm(result, input[i]);
		}
		return result;
	}
}
