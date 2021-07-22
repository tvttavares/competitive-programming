package Languages.Java.DataStructures;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		int totalNega = 0;

		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}
		scan.close();

		for (int j = 0; j < n; j++) {
			int soma = 0;
			for (int k = j; k < n; k++) {

				soma = ar[k] + soma;

				if (soma < 0)
					totalNega++;
			}
		}

		System.out.println(totalNega);

	}

}
