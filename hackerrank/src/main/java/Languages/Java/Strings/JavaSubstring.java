package Languages.Java.Strings;

import java.util.Scanner;

public class JavaSubstring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		int i = scan.nextInt();
		int j = scan.nextInt();
		scan.close();

		System.out.println(s.substring(i, j));
	}
}
