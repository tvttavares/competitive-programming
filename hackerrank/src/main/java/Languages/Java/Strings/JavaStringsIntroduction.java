package Languages.Java.Strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		scan.close();
		Character c1 = s1.charAt(0);
		Character c2 = s2.charAt(0);

		System.out.println(s1.length() + s2.length());
		System.out.println(s1.compareTo(s2) > 0 ? "Yes" : "No");
		System.out.println(
				c1.toString().toUpperCase() + s1.substring(1) + " " + c2.toString().toUpperCase() + s2.substring(1));
	}
}
