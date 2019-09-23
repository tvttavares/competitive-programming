package Challenges30DaysCode;

import java.util.Scanner;

public class Day2Operators {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double mc = scan.nextDouble();
		int tip = scan.nextInt();
		int tax = scan.nextInt();

		System.out.println((int) Math.round(mc + mc * tip / 100 + mc * tax / 100));

	}

}
