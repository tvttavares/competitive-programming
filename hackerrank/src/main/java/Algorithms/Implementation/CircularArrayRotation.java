package Algorithms.Implementation;

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int q = scanner.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		for (int j = 0; j < q; j++) {
			int m = scanner.nextInt();
			System.out.println(a[(n - (k % n) + m) % n]);
		}

		scanner.close();
	}

}
