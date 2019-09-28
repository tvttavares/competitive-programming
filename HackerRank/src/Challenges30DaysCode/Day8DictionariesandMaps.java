package Challenges30DaysCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8DictionariesandMaps {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		Map<String, Integer> dic = new HashMap<>();

		for (int i = 0; i < n; i++) {
			dic.put(scan.next(), scan.nextInt());
		}

		String s;
		while (scan.hasNext()) {
			s = scan.next();
			if (dic.containsKey(s))
				System.out.println(s + "=" + dic.get(s));
			else
				System.out.println("Not found");
		}
		scan.close();

	}

}
