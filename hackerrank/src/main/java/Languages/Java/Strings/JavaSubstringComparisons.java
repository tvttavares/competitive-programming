package Languages.Java.Strings;

import java.util.Scanner;

public class JavaSubstringComparisons {

	public static String getSmallestAndLargest(String s, int k) {
		String menor, maior;
		menor = maior = s.substring(0, k);

		for (int i = 0; i <= s.length() - k; i++) {
			if (s.substring(i, i + k).compareTo(menor) < 0)
				menor = s.substring(i, i + k);
			if (s.substring(i, i + k).compareTo(maior) > 0)
				maior = s.substring(i, i + k);
		}
		return menor + "\n" + maior;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}