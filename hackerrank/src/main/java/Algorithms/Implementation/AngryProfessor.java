package Algorithms.Implementation;

import java.util.Scanner;

public class AngryProfessor {
	static String angryProfessor(int k, int[] a) {
		int cont = 0;
		String res = "YES";
		for (int i : a) {
			if (i <= 0) {
				cont++;
			}
		}
		if (cont >= k) {
			res = "NO";
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		while (t-- > 0) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println(angryProfessor(k, arr));
		}
		scanner.close();
	}

}
