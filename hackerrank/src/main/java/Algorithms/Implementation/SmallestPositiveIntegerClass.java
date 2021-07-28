package Algorithms.Implementation;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveIntegerClass {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 4, 1, 2};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {-1, -3};
        System.out.println(smallestPositiveInteger(arr));
        System.out.println(smallestPositiveInteger(arr2));
        System.out.println(smallestPositiveInteger(arr3));
    }

    public static int smallestPositiveInteger(int[] A) {
        int nMissing = 1, n = A.length;
        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= n + 1; i++) {
            if (!set.contains(i)) {
                nMissing = i;
                break;
            }
        }
        return nMissing;
    }
}
