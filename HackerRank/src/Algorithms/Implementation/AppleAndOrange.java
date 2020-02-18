package Algorithms.Implementation;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int inicioCasa = scan.nextInt();
		int terminoCasa = scan.nextInt();
		int locAple = scan.nextInt();
		int locaOj = scan.nextInt();
		int numAp = scan.nextInt();
		int numOj = scan.nextInt();
		int[] apples = new int[numAp];
		int[] oranges = new int[numOj];

		int maxAp = 0;
		int maxOj = 0;

		for (int i = 0; i < numAp; i++) {
			apples[i] = scan.nextInt() + locAple;
			if (apples[i] <= terminoCasa && apples[i] >= inicioCasa)
				maxAp++;
		}
		for (int i = 0; i < numOj; i++) {
			oranges[i] = scan.nextInt() + locaOj;
			if (oranges[i] <= terminoCasa && oranges[i] >= inicioCasa)
				maxOj++;
		}
		scan.close();

		System.out.println(maxAp);
		System.out.println(maxOj);
	}

}
