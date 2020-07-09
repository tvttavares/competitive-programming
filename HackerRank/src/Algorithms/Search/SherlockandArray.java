package Algorithms.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SherlockandArray {
	static String balancedSums(List<Integer> arr) {
		int x = 0;
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}

		for (int y : arr) {
			if (2 * x == sum - y) {
				return "YES";
			}
			x = x + y;
		}
		return "NO";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();

		while (q-- > 0) {
			int n = scanner.nextInt();
			List<Integer> l = new ArrayList<>();
			while (n-- > 0) {
				l.add(scanner.nextInt());
			}

			System.out.println(balancedSums(l));
		}
		scanner.close();
	}

}
