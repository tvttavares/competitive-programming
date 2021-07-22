package Challenges30DaysCode;

import java.util.Scanner;

public class Day6LetsReview {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < n; i++) {
			StringBuilder par = new StringBuilder();
			StringBuilder imp = new StringBuilder();

			String w = scan.next();

			for (int j = 0; j < w.length(); j++) {
				if (j % 2 == 0)
					par.append(w.charAt(j));
				else
					imp.append(w.charAt(j));
			}
			System.out.println(par.toString() + " " + imp.toString());

		}
		scan.close();

	}
}
