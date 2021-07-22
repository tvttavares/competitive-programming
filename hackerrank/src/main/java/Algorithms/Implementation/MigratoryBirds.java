package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Integer, Integer> m = new HashMap<>();
		List<Integer> s = new ArrayList<>();

		int n = scan.nextInt();
		int max = 0;
		int mmin = 0;

		while (n-- > 0) {
			int i = scan.nextInt();
			if (m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			} else {
				m.put(i, 1);
			}

			if (m.get(i) > max) {
				max = m.get(i);
			}
		}
		scan.close();

		iterageList(m, s, max);
		mmin = getMinimal(s);

		System.out.println(mmin);
	}

	private static void iterageList(Map<Integer, Integer> m, List<Integer> s, int max) {
		for (Map.Entry<Integer, Integer> x : m.entrySet()) {
			if (x.getValue() == max) {
				s.add(x.getKey());
			}
		}
	}

	private static int getMinimal(List<Integer> s) {
		int mmin;
		mmin = s.get(0);
		if (s.size() > 1) {
			for (int i = 1; i < s.size(); i++) {
				if (s.get(i) < mmin) {
					mmin = s.get(i);
				}
			}
		}
		return mmin;
	}
}
