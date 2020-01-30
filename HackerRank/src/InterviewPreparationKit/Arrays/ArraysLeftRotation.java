package InterviewPreparationKit.Arrays;

import java.util.Scanner;

public class ArraysLeftRotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();

		while (d-- > 0) {
			int temp = a[0];
			for (int j = 1; j < n; j++) {
				a[j - 1] = a[j];
			}
			a[n - 1] = temp;
		}

		for (int x : a) {
			System.out.print(x + " ");
		}

	}

}
