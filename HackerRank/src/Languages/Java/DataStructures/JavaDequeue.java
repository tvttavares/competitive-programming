package Languages.Java.DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		HashSet<Integer> set = new HashSet<>();

		int n = scan.nextInt();
		int m = scan.nextInt();
		int max = Integer.MIN_VALUE;

		while (n-- > 0) {
			int input = scan.nextInt();

			deque.add(input);
			set.add(input);

			if (deque.size() == m) {
				if (set.size() > max)
					max = set.size();
				int first = deque.remove();
				if (!deque.contains(first))
					set.remove(first);
			}
		}
		scan.close();

		System.out.println(max);
	}
}