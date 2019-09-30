package Languages.Java.Strings;

import java.util.Scanner;

public class JavaStringReverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		scan.close();
		String pal = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			pal += s.charAt(i);
		}

		if (s.equals(pal))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
