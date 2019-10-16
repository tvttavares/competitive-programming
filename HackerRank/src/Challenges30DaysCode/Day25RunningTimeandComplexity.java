package Challenges30DaysCode;

import java.math.BigInteger;
import java.util.Scanner;

public class Day25RunningTimeandComplexity {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		while (n-- > 0) {
			BigInteger b = scan.nextBigInteger();

			if (b.isProbablePrime(1))
				System.out.println("Prime");
			else
				System.out.println("Not prime");
		}
		scan.close();

	}
}