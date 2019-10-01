package Languages.Java.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		List<List<Integer>> listOfLists = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int d = scan.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = 0; j < d; j++)
				list.add(scan.nextInt());

			listOfLists.add(list);
		}

		int q = scan.nextInt();

		for (int i = 0; i < q; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();

			try {
				System.out.println(listOfLists.get(x - 1).get(y - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}
		scan.close();

	}

}
