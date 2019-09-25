package Algorithms.Warmup;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {

		int qtd = 5;
		long[] numeros = new long[5];
		long total = 0, tot = 0, max = 0, min = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < qtd; i++) {
			numeros[i] = scan.nextLong();
			total += numeros[i];
		}
		scan.close();

		min = total;
		for (int i = 0; i < qtd; i++) {
			tot = total;
			tot -= numeros[i];

			if (tot > max)
				max = tot;
			if (tot < min)
				min = tot;

		}
		System.out.println(min + " " + max);
	}

}
