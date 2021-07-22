package Challenges30DaysCode;

import java.util.Scanner;

public class Day29BitwiseAND {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nTest = scan.nextInt();

		while (nTest-- > 0) {
			int n = scan.nextInt();
			int k = scan.nextInt();

			int nn[] = new int[n];
			nn[0] = 1;
			for (int i = 1; i < n; i++) {
				nn[i] = nn[i - 1] + 1;
			}

			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i != j) {
						if (((nn[i] & nn[j]) < k) && ((nn[i] & nn[j]) > max))
							max = (nn[i] & nn[j]);
					}
				}
			}
			System.out.println(max);
		}
		scan.close();
	}

}
