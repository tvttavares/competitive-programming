package Algorithms.Implementation;

import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		int max = 0, min = 0, qmin = 0, qmax = 0;
		for (int i = 0; i < q; i++) {
			int x = scan.nextInt();
			if (i == 0) {
				max = min = x;
			}
			if (x > max) {
				qmax++;
				max = x;
			}
			if (x < min) {
				qmin++;
				min = x;
			}
		}
		scan.close();

		System.out.println(qmax + " " + qmin);

	}

}
