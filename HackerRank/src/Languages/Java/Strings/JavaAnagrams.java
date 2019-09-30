package Languages.Java.Strings;

import java.util.Scanner;

public class JavaAnagrams {

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		java.util.Map<Character, Integer> m1 = new java.util.HashMap<Character, Integer>();
		java.util.Map<Character, Integer> m2 = new java.util.HashMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {
			if (m1.containsKey(s1.charAt(i)))
				m1.put(s1.charAt(i), m1.get(s1.charAt(i)) + 1);
			else
				m1.put(s1.charAt(i), 1);
		}
		for (int i = 0; i < s2.length(); i++) {
			if (m2.containsKey(s2.charAt(i)))
				m2.put(s2.charAt(i), m2.get(s2.charAt(i)) + 1);
			else
				m2.put(s2.charAt(i), 1);
		}

		if (m1.equals(m2))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}

}
