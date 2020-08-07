package Algorithms.Strings;

import java.util.Scanner;

public class MarsExploration {

	// Complete the marsExploration function below.
	static int marsExploration(String s) {
		int cont = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i <= s.length() - 3; i = i + 3) {
			if (c[i] != 'S')
				cont++;

			if (c[i + 1] != 'O')
				cont++;

			if (c[i + 2] != 'S')
				cont++;

		}

		return cont;
	}

	// SOS.SOS.SOS

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();

		System.out.println(marsExploration(s));
	}

}
