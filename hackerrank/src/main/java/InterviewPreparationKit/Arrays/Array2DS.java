package InterviewPreparationKit.Arrays;

import java.util.Scanner;

public class Array2DS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] m = new int[6][6];
		int cont = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = scan.nextInt();
			}
		}
		scan.close();

		for (int i = 0; i < m.length - 2; i++) {
			for (int j = 0; j < m.length - 2; j++) {
				cont = 0;
				cont += m[i][j] + m[i][j + 1] + m[i][j + 2];
				cont += m[i + 1][j + 1];
				cont += m[i + 2][j] + m[i + 2][j + 1] + m[i + 2][j + 2];

				if (cont > max)
					max = cont;
			}
		}

		System.out.println(max);

	}

}
