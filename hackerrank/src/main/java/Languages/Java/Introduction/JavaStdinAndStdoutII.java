package Languages.Java.Introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();
		scan.close();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + n);
	}
}
