package Challenges30DaysCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28RegExPatternAndIntrotoDatabases {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		String emailRegEx = ".@gmail\\.com$";
		Pattern p = Pattern.compile(emailRegEx);
		List<String> list = new ArrayList<>();

		while (n-- > 0) {
			String nome = scan.next();
			String email = scan.next();
			Matcher m = p.matcher(email);
			if (m.find())
				list.add(nome);
		}
		scan.close();

		Collections.sort(list);

		for (String s : list) {
			System.out.println(s);
		}

	}

}
