package Algorithms.Implementation;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int d1 = scan.nextInt();
		int d2 = scan.nextInt();
		int div = scan.nextInt();
		scan.close();
		int goodDays = 0;
		for (int i = d1; i <= d2; i++) {
			goodDays += reverseNumber(i, div);
		}
		System.out.println(goodDays);

	}

	private static int reverseNumber(int i, int div) {
		String s1 = String.valueOf(i);
		String s2 = new StringBuilder(s1).reverse().toString();

		return Math.abs(Integer.valueOf(s1) - Integer.valueOf(s2)) % div == 0 ? 1 : 0;
	}

}
