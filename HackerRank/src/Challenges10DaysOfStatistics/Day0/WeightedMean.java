package Challenges10DaysOfStatistics.Day0;

import java.util.Scanner;

public class WeightedMean {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		double[] x = new double[n];
		double[] w = new double[n];
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			w[i] = scan.nextInt();
		}
		scan.close();

		weightedMean(x, w);

	}

	private static void weightedMean(double[] x, double[] w) {
		double med = 0.0;
		double sumW = 0.0;
		for (int i = 0; i < x.length; i++) {
			med += x[i] * w[i];
			sumW += w[i];
		}

		System.out.printf("%.1f", med /= sumW);
	}

}
