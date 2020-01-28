package DataStructures.Arrays;

import java.util.Scanner;

public class ArraysDS {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num[] = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();

		for (int i = n - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}
}
