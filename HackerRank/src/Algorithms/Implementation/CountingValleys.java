package Algorithms.Implementation;

import java.util.Scanner;

public class CountingValleys {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int max = 0, cont = 0;

		scan.nextInt();
		String s = scan.next();
		scan.close();

		for (char c : s.toCharArray()) {
			if (c == 'U') cont++;
			else cont--;

			if (cont == 0 && c == 'U') max++;
		}
		System.out.println(max);
	}
}
