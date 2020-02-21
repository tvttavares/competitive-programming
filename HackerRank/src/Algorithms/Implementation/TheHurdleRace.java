package Algorithms.Implementation;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];
		int max = 0;
		int k = scan.nextInt();

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max > k ? max - k : 0);

		scan.close();
	}

}
