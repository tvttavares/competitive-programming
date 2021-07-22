package Challenges30DaysCode;

import java.util.Scanner;

abstract class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();
}

class MyBook extends Book {
	int p = 0;

	public MyBook(String t, String a, int pp) {
		super(t, a);
		this.p = pp;
	}

	void display() {
		System.out.println("Title: " + title + "\n" + "Author: " + author + "\n" + "Price: " + p);
	}
}

public class Day13AbstractClasses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();

		Book book = new MyBook(title, author, price);
		book.display();
	}
}