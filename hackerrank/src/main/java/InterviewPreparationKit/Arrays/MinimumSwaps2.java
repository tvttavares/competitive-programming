package InterviewPreparationKit.Arrays;

import java.util.Scanner;

public class MinimumSwaps2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		System.out.println(minimumSwaps(arr));
	}

	static int minimumSwaps(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != i + 1) {
				int temp = arr[i];
				arr[i] = arr[temp - 1];
				arr[temp - 1] = temp;
				count++;
			}
		}
		return count;
	}
}
