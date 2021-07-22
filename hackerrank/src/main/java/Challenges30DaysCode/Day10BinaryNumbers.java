package Challenges30DaysCode;

import java.util.Scanner;

public class Day10BinaryNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String s = "";
		int maxc = 0;
		int cont = 0;

		while (n > 0) {
			s = ((n % 2 == 0) ? "0" : "1") + s;
			n = n / 2;
		}

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				cont++;
				if (cont > maxc)
					maxc = cont;
			} else {
				cont = 0;
			}
		}
		System.out.println(maxc);

	}

}
