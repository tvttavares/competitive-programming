package Algorithms.Implementation;

import java.util.Scanner;

public class DesignerPDFViewer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[27];

		for (int i = 0; i < 26; i++) {
			arr[i] = scan.nextInt();
		}

		String s = scan.next();
		scan.close();

		System.out.println(designerPdfViewer(arr, s));
	}

	static int designerPdfViewer(int[] arr, String word) {
		int temp = 0;

		for (int i = 0; i < word.length(); i++) {
			int ascii = (int) word.charAt(i);
			int height = arr[ascii - 97];
			if (height > temp) {
				temp = height;
			}
		}
		return temp * word.length();
	}

}
