package Languages.Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		List<Integer> l = new ArrayList<>();

		while (n-- > 0) {
			l.add(scan.nextInt());
		}

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			String s = scan.next();
			scan.nextLine();

			if (s.equals("Insert")) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				l.add(x, y);
			} else {
				int x = scan.nextInt();
				l.remove(x);
			}
		}
		scan.close();

		for (Integer list : l) {
			System.out.print(list + " ");
		}

	}

}
