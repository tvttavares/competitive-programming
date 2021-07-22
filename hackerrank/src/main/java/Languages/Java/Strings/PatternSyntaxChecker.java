package Languages.Java.Strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();

		while (n > 0) {
			String p = scan.nextLine();
			try {
				Pattern.compile(p);
				System.out.println("Valid");
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			n--;
		}
		scan.close();
	}

}
