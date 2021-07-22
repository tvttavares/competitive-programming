package Languages.Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BigInteger b = scan.nextBigInteger();
		scan.close();

		if (b.isProbablePrime(1))
			System.out.println("prime");
		else
			System.out.println("not prime");

	}

}
