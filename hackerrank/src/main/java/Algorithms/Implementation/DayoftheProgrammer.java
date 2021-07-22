package Algorithms.Implementation;

import java.util.Scanner;

public class DayoftheProgrammer {

	private static String dayOfTheProgrammer(int year) {
		if (year == 1918) {
			return "26.09.1918";
		} else if ((year < 1918 && year % 4 == 0)
				|| (year > 1918 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0))) {
			return "12.09." + year;
		} else {
			return "13.09." + year;
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();
		scan.close();

		System.out.println(dayOfTheProgrammer(year));
	}

}
