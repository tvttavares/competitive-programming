package DataStructures.Trees;

import java.util.HashMap;
import java.util.Scanner;

class Trie {
	TrieNode root = new TrieNode();

	public void add(String str) {
		TrieNode curr = root;
		for (char ch : str.toCharArray()) {
			curr.putChildIfAbsent(ch);
			curr = curr.getChild(ch);
			curr.size++;
		}
	}

	public int find(String prefix) {
		TrieNode curr = root;

		for (char ch : prefix.toCharArray()) {
			curr = curr.getChild(ch);
			if (curr == null) {
				return 0;
			}
		}
		return curr.size;
	}
}

class TrieNode {
	private HashMap<Character, TrieNode> children = new HashMap<>();
	public int size = 0; // this was the main trick to decrease runtime to pass tests.

	public void putChildIfAbsent(char ch) {
		children.putIfAbsent(ch, new TrieNode());
	}

	public TrieNode getChild(char ch) {
		return children.get(ch);
	}
}

public class Contacts {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String r;
		Trie trie = new Trie();

		for (int i = 0; i < n; i++) {
			r = scan.next();
			if (r.equals("add")) {
				trie.add(scan.next());
			} else {
				System.out.println(trie.find(scan.next()));
			}
		}
		scan.close();
	}
}
