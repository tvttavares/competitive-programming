package Challenges30DaysCode;

import java.util.Scanner;

public class Day4ClassVSInstance {
	private int age;

	public Day4ClassVSInstance(int initialAge) {
		this.age = initialAge;
	}

	public void amIOld() {
		if (this.age < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			this.age = 0;
		}
		if (this.age < 13) {
			System.out.println("You are young.");
		} else if (13 <= this.age && this.age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}

	public void yearPasses() {
		this.age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4ClassVSInstance p = new Day4ClassVSInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}