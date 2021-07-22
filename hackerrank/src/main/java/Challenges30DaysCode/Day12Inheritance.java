package Challenges30DaysCode;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;

	public Student(String firstName, String lastName, int identification) {
		super(firstName, lastName, identification);
	}

	public Student(String firstName, String lastName, int id, int[] testScores2) {
		this(firstName, lastName, id);
		this.testScores = testScores2;
	}

	public String calculate() {
		int l = testScores.length;
		int total = 0;
		for (int x : testScores) {
			total += x;
		}
		total = total / l;

		if (90 <= total && total <= 100)
			return "O";
		else if (80 <= total && total < 90)
			return "E";
		else if (70 <= total && total < 80)
			return "A";
		else if (55 <= total && total < 70)
			return "P";
		else if (40 <= total && total < 55)
			return "D";
		else
			return "T";
	}
}

public class Day12Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}