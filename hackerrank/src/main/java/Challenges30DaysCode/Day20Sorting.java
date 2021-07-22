package Challenges30DaysCode;

import java.util.Scanner;

public class Day20Sorting {

	public static void bubbleSort(int[] x) {
		int numberOfSwaps = 0;
		int temp, temp2;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length - 1; j++) {
				if (x[j] > x[j + 1]) {
					temp = x[j];
					temp2 = x[j + 1];

					x[j] = temp2;
					x[j + 1] = temp;
					numberOfSwaps++;
				}
			}
			if (numberOfSwaps == 0)
				break;
		}
		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + x[0]);
		System.out.println("Last Element: " + x[x.length - 1]);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();

		bubbleSort(a);
	}
}
