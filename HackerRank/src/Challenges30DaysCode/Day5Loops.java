package Challenges30DaysCode;

import java.util.Scanner;

public class Day5Loops {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();

		for (int i = 1; i <= 10; i++)
			System.out.println(num + " x " + i + " = " + num * i);
	}
}
