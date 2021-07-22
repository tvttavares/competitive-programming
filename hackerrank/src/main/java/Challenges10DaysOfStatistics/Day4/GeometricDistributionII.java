package Challenges10DaysOfStatistics.Day4;

import java.util.Scanner;

public class GeometricDistributionII {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		double n = scanner.nextInt();
		scanner.close();

		double p = a / b;
		double q = 1 - p;
		double gd = 0;

		for (int i = 1; i <= n; i++) {
			gd += Math.pow(q, i - 1) * p;
		}

		System.out.printf("%.3f", gd);
	}

}
