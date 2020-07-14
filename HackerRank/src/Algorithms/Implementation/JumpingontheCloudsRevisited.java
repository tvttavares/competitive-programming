package Algorithms.Implementation;

import java.util.Scanner;

public class JumpingontheCloudsRevisited {
	static int jumpingOnClouds(int[] c, int k) {
		int i = 0;
		int energy = 100;

		do {
			i = (i + k) % c.length;
			energy -= c[i] * 2 + 1;

		} while (i != 0);

		return energy;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();

		System.out.println(jumpingOnClouds(arr, k));
	}

}
