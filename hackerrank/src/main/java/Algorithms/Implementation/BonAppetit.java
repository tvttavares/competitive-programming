package Algorithms.Implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int ana = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		int charge = scan.nextInt();
		scan.close();

		bonAppetit(arr, ana, charge);
	}

	private static void bonAppetit(int[] arr, int ana, int charge) {
		arr[ana] = 0;
		int med = 0;
		for (int an : arr) {
			med += an;
		}
		med = med / 2;

		if (med == charge) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(charge - med);
		}
	}

}
