package Languages.Java.DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		Map<String, Integer> dic = new HashMap<>();

		scan.nextLine();
		for (int i = 0; i < n; i++) {
			dic.put(scan.nextLine(), scan.nextInt());
			scan.nextLine();
		}

		String s;
		while (scan.hasNext()) {
			s = scan.nextLine();
			if (dic.containsKey(s))
				System.out.println(s + "=" + dic.get(s));
			else
				System.out.println("Not found");
		}
		scan.close();
	}
}
