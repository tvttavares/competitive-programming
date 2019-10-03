package Languages.Java.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int total = a / b;
			System.out.println(total);
			scan.close();
		} catch (InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
	}

}
