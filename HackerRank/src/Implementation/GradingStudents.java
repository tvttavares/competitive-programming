package Implementation;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtd = scan.nextInt();
		int[] student = new int[qtd];

		for (int i = 0; i < qtd; i++) {
			student[i] = scan.nextInt();

			if (student[i] > 37) {
				if (student[i] % 5 > 2)
					student[i] += (5 - student[i] % 5);
			}
		}
		scan.close();

		for (int s : student) {
			System.out.println(s);
		}
	}
}
