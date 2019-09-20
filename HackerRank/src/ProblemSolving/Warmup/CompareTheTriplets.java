package ProblemSolving.Warmup;

import java.io.IOException;
import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();

		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();

		int pa = (a0 > b0 ? 1 : 0) + (a1 > b1 ? 1 : 0) + (a2 > b2 ? 1 : 0);
		int pb = (a0 < b0 ? 1 : 0) + (a1 < b1 ? 1 : 0) + (a2 < b2 ? 1 : 0);

		System.out.print(pa + " " + pb);
	}

}
