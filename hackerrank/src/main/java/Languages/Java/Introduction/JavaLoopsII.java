package Languages.Java.Introduction;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int qtd = scan.nextInt();
		int a, b, n, t = 0;

		for (int i = 0; i < qtd; i++) {
			a = scan.nextInt();
			b = scan.nextInt();
			n = scan.nextInt();
			t = (int) (a + b * Math.pow(2, 0));

			for (int j = 1; j <= n; j++) {
				System.out.print(t + " ");
				t += b * Math.pow(2, j);
			}
			System.out.println();

		}
		scan.close();

	}

}
