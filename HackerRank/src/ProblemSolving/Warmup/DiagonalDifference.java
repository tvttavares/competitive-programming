package ProblemSolving.Warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int pd = 0, sd = 0;
		int num = scan.nextInt();

		int[][] matriz = new int[num][num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				matriz[i][j] = scan.nextInt();

				if (i == j)
					pd += matriz[i][j];

				if ((i + j) == (num - 1))
					sd += matriz[i][j];
			}
		}
		System.out.println(Math.abs((pd - sd)));
	}
}
