package Algorithms.Implementation;

import java.util.Scanner;
import java.util.TreeSet;

public class ManasaAndStones {

	static Integer[] stones(int n, int a, int b) {
		TreeSet<Integer> finalStones = new TreeSet<Integer>();
		for (int i = 0; i < n; i++) {
			int sum = (i * a) + ((n - 1 - i) * b);
			finalStones.add(sum);
		}
		return finalStones.toArray(new Integer[finalStones.size()]);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();

		while (q-- > 0) {
			int n = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();

			Integer[] arr = stones(n, a, b);

			for (Integer i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
