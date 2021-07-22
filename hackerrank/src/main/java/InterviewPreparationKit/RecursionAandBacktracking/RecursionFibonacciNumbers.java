package InterviewPreparationKit.RecursionAandBacktracking;

import java.util.Scanner;

public class RecursionFibonacciNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		scan.close();

		System.out.println(fibo(d));

	}

	static long fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

}
