package Algorithms.Implementation;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p = scan.nextInt();
		scan.close();

		int pages = minNUmber(n, p);
		System.out.println(pages);
	}

	private static int minNUmber(int n, int p) {
		int nPagesFront = 0, nPagesBack = 0;
		int i = 1;
		while (i != p && (i - 1) != p && (i <= n)) {
			if (i == 1 && i == p)
				break;

			nPagesFront++;
			if (i != 1 && (i == p || i - 1 == p))
				break;
			i += 2;
		}

		i = n;
		while (i != p && i >= 0) {
			if (n % 2 == 0) {
				if (i != n && i != p && (i == p || i + 1 == p))
					break;
				if (i == p)
					break;
				nPagesBack++;

			} else {
				if (i == p || i - 1 == p)
					break;
				nPagesBack++;
				if (i != p && (i == p || i + 1 == p))
					break;
			}
			i -= 2;
		}
		return nPagesFront < nPagesBack ? nPagesFront : nPagesBack;
	}

}
