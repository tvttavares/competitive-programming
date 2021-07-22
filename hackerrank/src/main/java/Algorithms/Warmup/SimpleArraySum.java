package Algorithms.Warmup;

import java.io.IOException;
import java.util.Scanner;

public class SimpleArraySum {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int tam = scan.nextInt();

		int total = 0;
		for (int i = 0; i < tam; i++) {
			total += scan.nextInt();
		}
		scan.close();

		System.out.println(total);
	}
}
