package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {

	static int[] cutTheSticks(int[] arr) {
		List<Integer> list = new ArrayList<>();

		Arrays.sort(arr);

		list.add(arr.length);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				list.add(arr.length - i);
			}
		}

		int[] res = list.stream().mapToInt(i -> i).toArray();

		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int[] result = cutTheSticks(arr);
		for (int x : result) {
			System.out.println(x);
		}
		scanner.close();
	}

}

//
//import java.io.*;
//import java.util.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i =0; i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        Arrays.sort(arr);
//        int min = arr[0];
//        for(int i =0; i<n;){
//            System.out.println(arr.length-i);
//            i++;
//            while(arr[i]==min){
//                i++;
//            }
//            min = arr[i];
//        }
//        
//    }
//}