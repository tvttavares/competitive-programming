package Languages.Java.Introduction;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 1;

		while (scan.hasNext()) {
			String s = scan.nextLine();
			System.out.println(i + " " + s);
			i++;
		}
		scan.close();

	}
}
