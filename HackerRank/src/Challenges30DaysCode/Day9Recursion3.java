package Challenges30DaysCode;

import java.util.Scanner;

public class Day9Recursion3 {
	public static int factorial(int n) {
		if (n == 0)
			return 1;

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		scan.close();
		System.out.print(factorial(x));
	}

}
