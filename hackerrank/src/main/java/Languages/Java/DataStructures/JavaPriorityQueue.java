package Languages.Java.DataStructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student1 {
	private int token;
	private String fname;
	private double cgpa;

	public Student1(int id, String fname, double cgpa) {
		super();
		this.token = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getToken() {
		return token;
	}

	public String getName() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}

class Priorities {
	public List<Student1> getStudents(List<String> events) {
		PriorityQueue<Student1> student_queue = new PriorityQueue<>(Comparator.comparing(Student1::getCgpa).reversed()
				.thenComparing(Student1::getName).thenComparing(Student1::getToken));
		List<Student1> students = new ArrayList<>();
		for (String e : events) {
			Scanner in = new Scanner(e);
			String event = in.next();
			if (event.equals("ENTER")) {
				String name = in.next();
				float cgpa = in.nextFloat();
				int token = in.nextInt();

				Student1 student = new Student1(token, name, cgpa);
				student_queue.add(student);
			} else if (event.equals("SERVED")) {
				Student1 first = student_queue.poll();
			}
			in.close();
		}
		Student1 first = student_queue.poll();
		if (first == null) {
			return students;
		} else {
			while (first != null) {

				students.add(first);
				first = student_queue.poll();

			}
			return students;
		}

	}
}

public class JavaPriorityQueue {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student1> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student1 st : students) {
				System.out.println(st.getName());
			}
		}
	}
}