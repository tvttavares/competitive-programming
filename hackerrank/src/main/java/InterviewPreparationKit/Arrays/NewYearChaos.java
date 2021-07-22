package InterviewPreparationKit.Arrays;

import java.util.Scanner;

public class NewYearChaos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ntest = scan.nextInt();

		while (ntest-- > 0) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			minimumBribes(arr);
		}
		scan.close();

	}

	private static void minimumBribes(int[] arr) {
		int bribes = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] - (i + 1) > 2) {
				System.out.println("Too chaotic");
				return;
			}

			for (int j = Math.max(0, arr[i] - 2); j < i; j++) {
				if (arr[j] > arr[i]) {
					bribes++;
				}
			}
		}

		System.out.println(bribes);
	}

}
