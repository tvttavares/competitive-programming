package Challenges10DaysOfStatistics.Day1;

import java.util.Scanner;

public class StandardDeviation {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();

		int[] arr = new int[q];
		for (int i = 0; i < q; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();

		standartDeviation(arr);

	}

	private static void standartDeviation(int[] arr) {
		double mean = 0;
		double squardeDistance = 0;
		for (int a : arr) {
			mean += a;
		}
		mean /= arr.length;

		for (int a : arr) {
			squardeDistance += Math.pow((a - mean), 2);
		}
		squardeDistance = Math.sqrt((squardeDistance / arr.length));
		System.out.printf("%.1f", squardeDistance);
	}

}