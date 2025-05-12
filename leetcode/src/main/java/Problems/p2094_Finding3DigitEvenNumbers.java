package Problems;

import java.util.TreeSet;

public class p2094_Finding3DigitEvenNumbers {

    public static int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> uniqueIntegers = new TreeSet<>(); // TreeSet to store unique and sorted results

        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                for (int k = 0; k < digits.length; k++) {

                    if (i != j && j != k && i != k) {
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                        if (digits[i] != 0 && num % 2 == 0) {
                            uniqueIntegers.add(num);
                        }
                    }

                }
            }
        }

        int[] result = new int[uniqueIntegers.size()];
        int index = 0;
        for (int num : uniqueIntegers) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(findEvenNumbers(new int[]{1, 2, 3}));
    }
}
