package Languages.Java.Strings;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		s = s.trim();
		scan.close();

		if (s == null || s.equals("")) {
			System.out.println("0");
		} else {
			String[] ss = s.split("[ !,?.\\\\_'@]+");

			System.out.println(ss.length);
			for (String x : ss)
				System.out.println(x);

		}
	}
}
