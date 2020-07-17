package Challenges10DaysOfStatistics.Day5;

import java.util.Scanner;

public class PoissonDistributionII {

	public static void main(String[] args) {
		/* Save input */
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		scan.close();

		/* E[x^2] = lambda + lambda^2. Plug this into each formula */
		double dailyCostA = 160 + 40 * (A + (A * A));
		double dailyCostB = 128 + 40 * (B + (B * B));

		/* Print output */
		System.out.format("%.3f%n", dailyCostA);
		System.out.format("%.3f%n", dailyCostB);
	}
}