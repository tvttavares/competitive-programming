package Languages.Java.Introduction;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("================================");

		for (int i = 0; i < 3; i++) {
			String s = scan.next();
			int n = scan.nextInt();

			System.out.printf("%-15s%03d\n", s, n);
		}
		scan.close();

		System.out.println("================================");
	}
}
