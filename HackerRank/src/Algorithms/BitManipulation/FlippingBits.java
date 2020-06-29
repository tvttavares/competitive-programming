package Algorithms.BitManipulation;

import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int q = scan.nextInt();

		while (q-- > 0) {
			flipBits(scan.nextLong());
		}

		scan.close();
	}

	private static void flipBits(long longNumber) {
		String s = "";
		long sum = 0;
		long x = longNumber;
		do {
			s = Long.toString(x % 2) + s;
			x = x / 2;
		} while (x != 0);

		while (s.length() != 32) {
			s = "0" + s;
		}

		s = s.replaceAll("0", "#");
		s = s.replaceAll("1", "0");
		s = s.replaceAll("#", "1");
		for (int j = 0; j < s.length(); j++) {
			sum = (long) (Math.pow(2, (s.length() - j - 1))) * Character.getNumericValue(s.charAt(j)) + sum;
		}

		System.out.println(sum);
	}

}
