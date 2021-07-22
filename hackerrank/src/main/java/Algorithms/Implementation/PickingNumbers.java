package Algorithms.Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();

		System.out.println(pickingNumbers(arr));
	}

	private static int pickingNumbers(int[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		int max = 0;
		for (int i = len - 1; i >= 0; i--) {
			int count = 1;
			for (int j = i - 1; j >= 0; j--) {
				if ((arr[i] - arr[j]) < 2)
					count++;
			}
			max = count > max ? count : max;
		}
		return max;
	}

}
