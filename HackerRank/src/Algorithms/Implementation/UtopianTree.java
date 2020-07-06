package Algorithms.Implementation;

import java.util.Scanner;

public class UtopianTree {

	private static int utopianTree(int n) {
		int h = 1;
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				h += 1;
			} else {
				h *= 2;
			}
		}

		return h;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nCases = scan.nextInt();
		while (nCases-- > 0) {
			System.out.println(utopianTree(scan.nextInt()));
		}
		scan.close();

	}

}
