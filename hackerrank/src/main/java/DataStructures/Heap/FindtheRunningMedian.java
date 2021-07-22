package DataStructures.Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//	We use 2 Heaps to keep track of median
//	We make sure that 1 of the following conditions is always true:
//	1) maxHeap.size() == minHeap.size()
//	2) maxHeap.size() - 1 = minHeap.size()

public class FindtheRunningMedian {
	// keeps track of the SMALL numbers
	private static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

	// keeps track of the LARGE numbers
	private static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	private static double getMedian() {
		if (maxHeap.isEmpty()) {
			return 0;
		} else if (maxHeap.size() == minHeap.size()) {
			return (maxHeap.peek() + minHeap.peek()) / 2.0;
		} else {
			return maxHeap.peek();
		}
	}

	private static void addNumber(int num) {
		if (maxHeap.isEmpty()) {
			maxHeap.add(num);
		} else if (maxHeap.size() == minHeap.size()) {
			if (num < minHeap.peek()) {
				maxHeap.add(num);
			} else {
				minHeap.add(num);
				maxHeap.add(minHeap.remove());
			}
		} else if (maxHeap.size() > minHeap.size()) {
			if (num > maxHeap.peek()) {
				minHeap.add(num);
			} else {
				maxHeap.add(num);
				minHeap.add(maxHeap.remove());
			}
		}
	}

	public static void medianTracker(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			addNumber(ar[i]);
			System.out.println(getMedian());
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		medianTracker(array);
	}

}
