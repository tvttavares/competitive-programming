package Algorithms.BitManipulation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumVsXOR {

	static long sumXor(long n) {
		/* Calculate number of "x" values that will satisfy n+x = n^x */
		int zeroes = numZeroes(n);
//	    return 1L << zeroes; // same as (long) Math.pow(2, zeroes);
		return (long) Math.pow(2, zeroes);
	}

	private static int numZeroes(long n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) == 0) {
				count++;
			}
			n >>= 1; // divides by 2
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		long n = Long.parseLong(bufferedReader.readLine().trim());

		long result = sumXor(n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
