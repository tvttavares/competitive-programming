package Algorithms.Warmup;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String tempo = scan.nextLine();
		scan.close();
		String pm = tempo.substring(8, 10);

		if (pm.equals("PM")) {
			if (tempo.substring(0, 2).equals("12"))
				System.out.println(tempo.substring(0, 8));
			else
				System.out.println(Integer.valueOf(tempo.substring(0, 2)) + 12 + (tempo.substring(2, 8)));
		} else {
			if (tempo.substring(0, 2).equals("12"))
				System.out.println("00" + (tempo.substring(2, 8)));
			else
				System.out.println(tempo.substring(0, 8));
		}
	}
}
