package Algorithms.Implementation;

import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int d = scan.nextInt();
		int m = scan.nextInt();
		scan.close();

		birthdayChocolate(arr, d, m);
	}

	private static void birthdayChocolate(int[] arr, int d, int m) {
		int cont = 0;
		for (int i = 0; i < arr.length - m + 1; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				sum = sum + arr[i + j];
			}
			if (sum == d) {
				cont++;
			}
		}
		System.out.println(cont);
	}

}
