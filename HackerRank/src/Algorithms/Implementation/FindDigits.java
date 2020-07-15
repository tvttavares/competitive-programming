package Algorithms.Implementation;

import java.util.Scanner;

public class FindDigits {
	static int findDigits(int n) {
		int cont = 0;
		char[] s = String.valueOf(n).toCharArray();

		for (char c : s) {
			if (Integer.valueOf(String.valueOf(c)) != 0) {
				if (n % Integer.valueOf(String.valueOf(c)) == 0) {
					cont++;
				}
			}
		}
		return cont;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		while (q-- > 0) {
			System.out.println(findDigits(scanner.nextInt()));
		}
		scanner.close();
	}

}
