package Languages.Java.Introduction;

import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			try {
				long x = scan.nextLong();

				System.out.println(x + " can be fitted in:");
				if (x >= Math.pow(2, 8 - 1) * (-1) && x <= Math.pow(2, 8 - 1) - 1)
					System.out.println("* byte");
				if (x >= Math.pow(2, 16 - 1) * (-1) && x <= Math.pow(2, 16 - 1) - 1)
					System.out.println("* short");
				if (x >= Math.pow(2, 32 - 1) * (-1) && x <= Math.pow(2, 32 - 1) - 1)
					System.out.println("* int");
				if (x >= Math.pow(2, 64 - 1) * (-1) && x <= Math.pow(2, 64 - 1) - 1)
					System.out.println("* long");

			} catch (Exception e) {
				System.out.println(scan.next() + " can't be fitted anywhere.");
			}
		}
		scan.close();
	}
}
