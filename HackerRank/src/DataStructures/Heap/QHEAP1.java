package DataStructures.Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QHEAP1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ntest = scan.nextInt();
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();

		while (ntest-- > 0) {
			int n = scan.nextInt();
			if (n == 1) {
				q.add(scan.nextInt());
			}
			if (n == 2) {
				q.remove(scan.nextInt());
			}
			if (n == 3) {
				System.out.println(q.peek());
			}
		}
		scan.close();
	}

}
