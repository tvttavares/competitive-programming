package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;

public class ModifiedKaprekarNumbers {

    private static void kaprekarNumbers(int p, int q) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = p; i <= q; i++) {
            long square = (long) Math.pow(i, 2);

            String squareString = String.valueOf(square);

            int nDigits = String.valueOf(i).length();
            int splitIndex = squareString.length() - nDigits;

            Integer r = Integer.valueOf(squareString.substring(splitIndex));
            Integer l = Integer.valueOf(splitIndex > 0 ? squareString.substring(0, splitIndex) : "0");

            if ((r + l) == i) {
                numbers.add(i);
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(numbers.stream().map(String::valueOf).reduce((a, b) -> a + " " + b).orElse(""));
        }

    }

    public static void main(String[] args) {
        kaprekarNumbers(99999, 99999);
    }


}
