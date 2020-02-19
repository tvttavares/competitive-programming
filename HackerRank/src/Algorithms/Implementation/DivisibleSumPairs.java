package Algorithms.Implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int ar = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[ar];
		int contMax = 0;

		for (int i = 0; i < ar; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 0; i < ar - 1; i++) {
			for (int j = i + 1; j < ar; j++) {
				if ((arr[i] + arr[j]) % k == 0) {
					contMax++;
				}
			}
		}

		System.out.println(contMax);

	}
}
