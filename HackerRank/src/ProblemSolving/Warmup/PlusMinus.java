package ProblemSolving.Warmup;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int pos = 0, neg = 0, zero = 0;

		int[] numeros = new int[num];
		for (int i = 0; i < num; i++) {
			numeros[i] = scan.nextInt();

			if (numeros[i] > 0)
				pos++;
			else if (numeros[i] < 0)
				neg++;
			else
				zero++;
		}

		System.out.printf("%.6f", Double.valueOf(pos) / Double.valueOf(num));
		System.out.println();
		System.out.printf("%.6f", Double.valueOf(neg) / Double.valueOf(num));
		System.out.println();
		System.out.printf("%.6f", Double.valueOf(zero) / Double.valueOf(num));
		System.out.println();

	}

}
