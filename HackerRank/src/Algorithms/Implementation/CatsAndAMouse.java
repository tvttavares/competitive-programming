package Algorithms.Implementation;

import java.util.Scanner;

public class CatsAndAMouse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();

		while (q-- > 0) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			;
			int c = scan.nextInt();
			catAndMouse(a, b, c);
		}
		scan.close();

	}

	private static void catAndMouse(int a, int b, int c) {

		if(Math.abs(c - a) == Math.abs(c - b)) {
			System.out.println("Mouse C");
		} else if (Math.abs(c - a) < Math.abs(c - b)) {
			System.out.println("Cat A");
		} else {
			System.out.println("Cat B");
		}
		

	}

}
