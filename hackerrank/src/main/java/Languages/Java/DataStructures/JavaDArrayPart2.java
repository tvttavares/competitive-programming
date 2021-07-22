package Languages.Java.DataStructures;

import java.util.Scanner;

public class JavaDArrayPart2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();

		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			System.out.println(canWin(leap, arr) ? "YES" : "NO");
		}
		scan.close();
	}

	public static boolean canWin(int leap, int[] game) {
		if (game == null) {
			return false;
		}
		return isSolvable(leap, game, 0);
	}

	private static boolean isSolvable(int leap, int[] game, int i) {
		// Base Cases
		if (i >= game.length) {
			return true;
		} else if (i < 0 || game[i] == 1) {
			return false;
		}

		game[i] = 1; // marks as visited

		// Recursive Cases (Tries +m first to try to finish game quickly)
		return isSolvable(leap, game, i + leap) || isSolvable(leap, game, i + 1) || isSolvable(leap, game, i - 1);
	}

}
