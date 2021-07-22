package CrackingtheCodingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTablesRansomNote {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		scan.nextLine();
		Map<String, Integer> mag = new HashMap<>();

		String[] magWords = scan.nextLine().split(" ");
		String[] noteWords = scan.nextLine().split(" ");
		scan.close();

		for (String s : magWords) {
			if (mag.containsKey(s)) {
				mag.put(s, mag.get(s) + 1);
			} else {
				mag.put(s, 1);
			}
		}

		for (String s : noteWords) {
			if (!mag.containsKey(s)) {
				System.out.print("No");
				return;
			}
			int counter = mag.get(s) - 1;

			if (counter == 0) {
				mag.remove(s);
			} else {
				mag.put(s, counter);
			}
		}
		System.out.print("Yes");
	}
}
