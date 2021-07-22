package Algorithms.Implementation;

import java.util.Scanner;

public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
		int max = -1;

		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if (keyboards[i] + drives[j] <= budget && keyboards[i] + drives[j] > max)
					max = keyboards[i] + drives[j];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int b = scan.nextInt();
		int k = scan.nextInt();
		int d = scan.nextInt();

		int[] keyboards = new int[k];
		int[] drives = new int[d];

		for (int i = 0; i < k; i++) {
			keyboards[i] = scan.nextInt();
		}

		for (int i = 0; i < d; i++) {
			drives[i] = scan.nextInt();
		}
		scan.close();

		System.out.println(getMoneySpent(keyboards, drives, b));
	}

}
