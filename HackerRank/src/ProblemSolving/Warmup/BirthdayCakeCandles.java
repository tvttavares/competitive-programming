package ProblemSolving.Warmup;

import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int max = 0, cont = 0;

		int[] numeros = new int[num];

		for (int i = 0; i < num; i++) {
			numeros[i] = scan.nextInt();

			if (numeros[i] > max)
				max = numeros[i];
		}
		scan.close();

		for (int i = 0; i < num; i++) {
			if (numeros[i] == max)
				cont++;
		}

		System.out.println(cont);
	}
}
