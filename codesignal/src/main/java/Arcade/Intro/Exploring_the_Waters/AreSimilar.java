package Arcade.Intro.Exploring_the_Waters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AreSimilar {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{2, 1, 3};

        System.out.println(areSimilar(a, b));
    }

    private static boolean areSimilar(int[] a, int[] b) {
        if (a.length != b.length) return false;

        int countSwap = 0;
        int[] copyA = Arrays.copyOf(a, a.length);
        int[] copyB = Arrays.copyOf(b, b.length);

        // checking both contain the same elements...
        Arrays.sort(copyA);
        Arrays.sort(copyB);
        if (!Arrays.equals(copyA, copyB)) return false;

        // checking for min 2 swaps using original arrays...
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) countSwap++;
        }

        return (countSwap == 2 || countSwap == 0);
    }

}