package Algorithms.Implementation;

import java.util.Scanner;

public class JumpingOntheClouds {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nClouds = scan.nextInt();
		int[] clouds = new int[nClouds];

		for (int i = 0; i < nClouds; i++) {
			clouds[i] = scan.nextInt();
		}
		scan.close();

		System.out.println(jumpingClouds(clouds));
	}

	private static int jumpingClouds(int[] clouds) {
		int current = clouds[0];
		int maxJumps = 0;

		while (current != clouds.length - 1) {
			if (current + 2 < clouds.length && clouds[current + 2] == 0) {
				current += 2;
				maxJumps++;
			} else {
				current++;
				maxJumps++;
			}
		}
		return maxJumps++;
	}

}
