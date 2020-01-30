package Algorithms.Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[n];
		int cont = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.putIfAbsent(arr[i], 1);
			}
		}
		scan.close();

		for (Integer val : map.values()) {
			cont += val / 2;
		}
		System.out.println(cont);
	}
}