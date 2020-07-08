package Algorithms.Search;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamParlor {

	private static int[] icecreamParlor(int m, int[] arr) {
		int[] res = new int[2];
		boolean stop = false;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = (arr.length - 1); j > i; j--) {
				if (arr[i] + arr[j] == m) {
					res[0] = i + 1;
					res[1] = j + 1;
					stop = true;
					break;
				}
			}

			if (stop) {
				break;
			}
		}

		Arrays.sort(res);
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();

		while (q-- > 0) {
			int m = scanner.nextInt();
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}

			for (Integer i : icecreamParlor(m, arr)) {
				System.out.print(i + " ");
			}
		}
		scanner.close();
	}

}
