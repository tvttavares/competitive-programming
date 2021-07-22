package Algorithms.Implementation;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		long n = scan.nextLong();
		scan.close();
		System.out.println(repeatedString(s, n));
	}

	private static long repeatedString(String s, long n) {
		long cont = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				cont++;
			}
		}

		long div = n / s.length();
		long remider = n % s.length();
		cont = div * cont;

		for (int i = 0; i < remider; i++) {
			if (s.charAt(i) == 'a') {
				cont++;
			}
		}
		return cont;
	}

}
