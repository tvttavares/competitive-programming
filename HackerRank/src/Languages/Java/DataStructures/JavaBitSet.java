package Languages.Java.DataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);

		while (m-- > 0) {
			String s = scan.next();
			int x = scan.nextInt();
			int y = scan.nextInt();

			switch (s) {
			case "AND":
				if (x == 1)
					b1.and(b2);
				else
					b2.and(b1);
				break;
			case "OR":
				if (x == 1)
					b1.or(b2);
				else
					b2.or(b1);
				break;
			case "XOR":
				if (x == 1)
					b1.xor(b2);
				else
					b2.xor(b1);
				break;
			case "FLIP":
				if (x == 1)
					b1.flip(y);
				else
					b2.flip(y);
				break;
			case "SET":
				if (x == 1)
					b1.set(y);
				else
					b2.set(y);
				break;
			default:
				break;
			}

			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}
		scan.close();
	}

}
