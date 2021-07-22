package Algorithms.Implementation;

import java.util.Scanner;

public class SavethePrisoner {
	static int saveThePrisoner(int n, int m, int s) {
		int res = 0;

		if ((m + s - 1) % n == 0) {
			res = n;
		} else {
			res = (m + s - 1) % n;
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		while (q-- > 0) {
			int prisioners = scanner.nextInt();
			int sweets = scanner.nextInt();
			int startingChair = scanner.nextInt();
			System.out.println(saveThePrisoner(prisioners, sweets, startingChair));
		}

		scanner.close();
	}

}
