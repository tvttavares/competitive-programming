package Challenges30DaysCode;

import java.util.Scanner;

public class Day16ExceptionsStringtoInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		try {
			int n = Integer.valueOf(s);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("Bad String");
		}
		scan.close();
	}

}
