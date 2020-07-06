package Algorithms.Implementation;

import java.util.Scanner;

public class SequenceEquation {
	private static int[] permutationEquation(int[] p) {
		int[] result = new int[p.length];

		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length; j++) {
				if (i + 1 == p[j]) {
					for (int k = 0; k < p.length; k++) {
						if (p[k] == j + 1) {
							result[i] = k + 1;
						}
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();

		int arr[] = new int[q];
		for (int i = 0; i < q; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		int[] result = permutationEquation(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
