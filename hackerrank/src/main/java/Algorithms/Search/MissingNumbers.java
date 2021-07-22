package Algorithms.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MissingNumbers {

	static int[] missingNumbers(int[] arr, int[] brr) {
		List<Integer> l1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> l2 = Arrays.stream(brr).boxed().collect(Collectors.toList());
		List<Integer> res = new ArrayList<>();

		for (Integer i : l2) {
			if (!l1.contains(i)) {
				if (!res.contains(i)) {
					res.add(i);
				}
			} else {
				l1.remove(Integer.valueOf(i));
			}
		}
		Collections.sort(res);

		int[] array = res.stream().mapToInt(i -> i).toArray();

		return array;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int[] arr1 = new int[n1];
		for (int i = 0; i < n1; i++) {
			arr1[i] = scanner.nextInt();
		}

		int n2 = scanner.nextInt();
		int[] arr2 = new int[n2];
		for (int i = 0; i < n2; i++) {
			arr2[i] = scanner.nextInt();
		}

		int[] result = missingNumbers(arr1, arr2);
		for (int r : result) {
			System.out.print(r + " ");
		}

		scanner.close();
	}

}
