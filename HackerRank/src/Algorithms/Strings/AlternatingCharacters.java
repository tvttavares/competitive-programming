package Algorithms.Strings;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		while (n-- > 0) {
			String s = scan.next();
			int cont = 0;
			for (int j = 0; j < s.length() - 1; j++) {
				if (s.charAt(j) == s.charAt(j + 1)) {
					cont++;
				}
			}
			System.out.println(cont);
		}
		scan.close();

	}

}
