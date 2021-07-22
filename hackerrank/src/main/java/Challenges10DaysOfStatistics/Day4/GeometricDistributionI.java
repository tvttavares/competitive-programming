package Challenges10DaysOfStatistics.Day4;

import java.util.Scanner;

public class GeometricDistributionI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextInt();
		double b = scanner.nextInt();
		double n = scanner.nextInt();
		scanner.close();

		double p = a / b;
		double q = 1 - p;

		double gd = Math.pow(q, n - 1) * p;

		System.out.printf("%.3f", gd);
	}

}
