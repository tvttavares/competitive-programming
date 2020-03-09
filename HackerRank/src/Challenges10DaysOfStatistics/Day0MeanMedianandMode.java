package Challenges10DaysOfStatistics;

import java.util.Arrays;
import java.util.Scanner;

public class Day0MeanMedianandMode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		printMean(arr);
		printMedian(arr);
		printMode(arr);
	}

	private static void printMode(int[] arr) {
		Arrays.sort(arr);
		int maxCount = 0;
		int maxValue = 0;
		for (int number : arr) {
			int count = 0;
			for (int innerNumber : arr) {
				if (number == innerNumber) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxValue = number;
			}

		}
		System.out.println(maxValue);
	}

	private static void printMedian(int[] arr) {
		Arrays.sort(arr);
		double sum = (arr[arr.length / 2 - 1] + arr[arr.length / 2]);
		sum /= 2;
		System.out.printf("%.1f\n", sum);

	}

	private static void printMean(int[] arr) {
		double sum = 0;
		for (int number : arr) {
			sum += number;
		}
		System.out.printf("%.1f\n", sum / arr.length);
	}

}
