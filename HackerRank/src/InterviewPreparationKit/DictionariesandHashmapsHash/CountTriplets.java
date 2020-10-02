package InterviewPreparationKit.DictionariesandHashmapsHash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountTriplets {

	private static long countTriplets(List<Long> list, long r) {
		Map<Long, Long> leftMap = new HashMap<>();
		Map<Long, Long> rightMap = new HashMap<>();

		for (long item : list) {
			rightMap.put(item, rightMap.getOrDefault(item, 0L) + 1);
		}

		long count = 0;

		for (int i = 0; i < list.size(); i++) {
			long midTerm = list.get(i);
			long c1 = 0, c3 = 0;

			rightMap.put(midTerm, rightMap.getOrDefault(midTerm, 0L) - 1);

			if (leftMap.containsKey(midTerm / r) && midTerm % r == 0) {
				c1 = leftMap.get(midTerm / r);
			}

			if (rightMap.containsKey(midTerm * r))
				c3 = rightMap.get(midTerm * r);

			count += c1 * c3;

			leftMap.put(midTerm, leftMap.getOrDefault(midTerm, 0L) + 1);

		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		List<Long> list = new ArrayList<>();

		while (n-- > 0) {
			list.add(scan.nextLong());
		}

		scan.close();

		System.out.println(countTriplets(list, r));
	}

}
