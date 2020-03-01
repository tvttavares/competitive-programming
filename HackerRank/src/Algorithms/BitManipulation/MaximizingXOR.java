package Algorithms.BitManipulation;

import java.util.Scanner;

public class MaximizingXOR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int r = scan.nextInt();
		scan.close();

		System.out.println(maxXOR(l, r));
	}

	private static int maxXOR(int l, int r) {
		int max = 0;

		for (int i = l; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				if ((i ^ j) > max) {
					max = i ^ j;
				}
			}
		}

		return max;
	}

}
