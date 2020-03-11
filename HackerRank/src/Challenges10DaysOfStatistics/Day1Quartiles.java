package Challenges10DaysOfStatistics;

import java.util.Arrays;
import java.util.Scanner;

public class Day1Quartiles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		Arrays.sort(arr);

		quartiles(arr);

	}

	private static void quartiles(int[] arr) {
		System.out.println(median(arr, 0, arr.length / 2 - 1));
		System.out.println(median(arr, 0, arr.length - 1));
		if (arr.length % 2 == 0) {
			System.out.println(median(arr, arr.length / 2, arr.length - 1));
		} else {
			System.out.println(median(arr, arr.length / 2 + 1, arr.length - 1));
		}
	}

	private static int median(int[] arr, int start, int end) {
		int length = end - start + 1;
		int median = 0;
		if (length % 2 != 0) {
			median = arr[start + length / 2];
		} else {
			median = (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
		}
		return median;
	}

}
