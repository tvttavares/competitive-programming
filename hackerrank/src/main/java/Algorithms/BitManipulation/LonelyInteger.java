package Algorithms.BitManipulation;

import java.util.Scanner;

//1) x ^ x = 0
//2) x ^ 0 = x
//3) XOR is commutative and associative
public class LonelyInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();

		System.out.println(lonelyInteger(arr));
	}

	private static int lonelyInteger(int[] arr) {
		int val = 0;

		for (int num : arr) {
			val = val ^ num; // XOR
		}

		return val;
	}
}
