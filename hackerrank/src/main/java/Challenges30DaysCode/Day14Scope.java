package Challenges30DaysCode;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference = 0;
	int total;

	public Difference(int[] a) {
		this.elements = a;
	}

	public void computeDifference() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				if (i != j) {
					total = elements[i] - elements[j];
					if (total < 0)
						total = total * (-1);

					if (total > maximumDifference)
						maximumDifference = total;
				}
			}
		}
	}
} // End of Difference class

public class Day14Scope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}