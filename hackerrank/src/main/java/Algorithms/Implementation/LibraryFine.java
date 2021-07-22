package Algorithms.Implementation;

import java.util.Scanner;

public class LibraryFine {
	static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
		int f = 0;

		if (y1 > y2) {
			f = 10000;
		} else if (y1 == y2) {
			if (m1 > m2) {
				f = 500 * (m1 - m2);
			} else if (m1 == m2) {
				if (d1 > d2) {
					f = 15 * (d1 - d2);
				}
			}
		}

		return f;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int d1 = scan.nextInt();
		int m1 = scan.nextInt();
		int y1 = scan.nextInt();
		int d2 = scan.nextInt();
		int m2 = scan.nextInt();
		int y2 = scan.nextInt();

		scan.close();
		System.out.println(libraryFine(d1, m1, y1, d2, m2, y2));
	}

}
