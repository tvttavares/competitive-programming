package Languages.Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		BigInteger a = scan.nextBigInteger();
		BigInteger b = scan.nextBigInteger();
		scan.close();
		BigInteger c, d;

		c = a.add(b);
		d = a.multiply(b);

		System.out.println(c + "\n" + d);
	}

}
