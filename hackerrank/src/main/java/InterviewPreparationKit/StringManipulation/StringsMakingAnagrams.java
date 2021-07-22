package InterviewPreparationKit.StringManipulation;

import java.util.Scanner;

public class StringsMakingAnagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();

		System.out.println(makeAnagram(a, b));
	}

	private static int makeAnagram(String a, String b) {
		int[] lettercounts = new int[26];
		for (char c : a.toCharArray()) {
			lettercounts[c - 'a']++;
		}
		for (char c : b.toCharArray()) {
			lettercounts[c - 'a']--;
		}
		int result = 0;
		for (int i : lettercounts) {
			result += Math.abs(i);
		}
		return result;
	}

}
