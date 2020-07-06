package Algorithms.Implementation;

import java.util.Scanner;

public class ViralAdvertising {
	private static int viralAdvertising(int days) {
		int people = 5;
		int sum = 0;

		for (int i = 0; i < days; i++) {
			people = (int) Math.floor(people / 2);
			sum += people;
			people *= 3;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int days = scan.nextInt();
		scan.close();

		System.out.println(viralAdvertising(days));
	}

}
