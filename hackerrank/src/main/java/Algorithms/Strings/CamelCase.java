package Algorithms.Strings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		System.out.println(camelCase(s));
	}

	private static int camelCase(String s) {
		String arr[] = s.split("[A-Z]");
		return arr.length;
	}

}
