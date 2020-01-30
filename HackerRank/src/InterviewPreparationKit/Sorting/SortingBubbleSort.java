package InterviewPreparationKit.Sorting;

import java.util.Scanner;

public class SortingBubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();

		countSwaps(a);
	}

	public static void countSwaps(int[] a) {
		int swap = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
					swap++;
				}
			}
		}
		System.out.println("Array is sorted in " + swap + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);
	}

}
