package InterviewPreparationKit.DictionariesandHashmapsHash;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ntest = scan.nextInt();

		while (ntest-- > 0) {
			String s1 = scan.next();
			String s2 = scan.next();
			String result = twoStrings(s1, s2);
			System.out.println(result);
		}
		scan.close();
	}

	private static String twoStrings(String s1, String s2) {

		int len = s1.length() < s2.length() ? s1.length() : s2.length();
		int charExist[] = new int[26];

		for (int i = 0; i < len; i++) {
			int index = s1.charAt(i) - 'a';
			charExist[index] = 1;
		}
		for (int i = 0; i < len; i++) {
			int index = s2.charAt(i) - 'a';
			if (charExist[index] > 0)
				return "YES";

		}
		return "NO";
	}

}
