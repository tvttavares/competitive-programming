package Challenges30DaysCode;

import java.util.Scanner;

public class Day26NestedLogic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int d1 = scan.nextInt();
		int m1 = scan.nextInt();
		int y1 = scan.nextInt();

		int d2 = scan.nextInt();
		int m2 = scan.nextInt();
		int y2 = scan.nextInt();

		if (y2 < y1) {
			System.out.println(10000);
		} else if (y2 > y1) {
			System.out.println(0);
		} else {
			if (m2 < m1) {
				System.out.println((m1 - m2) * 500);
			} else if (m2 > m1) {
				System.out.println(0);
			} else {
				if (d2 < d1) {
					System.out.println((d1 - d2) * 15);
				} else {
					System.out.println(0);
				}
			}
		}

		scan.close();
	}

}
