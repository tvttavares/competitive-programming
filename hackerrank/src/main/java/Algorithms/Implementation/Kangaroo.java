package Algorithms.Implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x1 = scan.nextInt();
		int v1 = scan.nextInt();
		int x2 = scan.nextInt();
		int v2 = scan.nextInt();
		scan.close();
		int i = 0;
		boolean ponto = false;

		while (x1 + v1 * i <= x2 + v2 * i) {
			if (x1 + v1 * i == x2 + v2 * i) {
				ponto = true;
				break;
			}
			i++;
		}

		if (ponto == true)
			System.out.println("YES");

		if (ponto == false)
			System.out.println("NO");
	}

}
