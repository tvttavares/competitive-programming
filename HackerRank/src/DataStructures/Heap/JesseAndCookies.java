package DataStructures.Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class JesseAndCookies {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();

		while (n-- > 0) {
			q.add(scan.nextInt());
		}
		scan.close();

		cookies(q, k);
	}

	private static void cookies(PriorityQueue<Integer> q, int k) {
		int op = 0;
		while (q.size() > 1 && q.peek() < k) {
			int leastSweet = q.poll();
			int secondLeast = q.poll();
			q.add(leastSweet + 2 * secondLeast);
			op++;
		}

		if (q.peek() < k) {
			System.out.print(-1);
		} else {
			System.out.print(op);
		}
	}

}
