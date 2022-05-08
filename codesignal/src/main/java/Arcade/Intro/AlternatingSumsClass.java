package Arcade.Intro;

import java.util.Arrays;

public class AlternatingSumsClass {

    public static void main(String[] args) {
        int[] a = new int[]{50, 60, 60, 45, 70};

        System.out.println(Arrays.toString(alternatingSums(a)));
    }

    static int[] alternatingSums(int[] a) {
        int[] res = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                res[0] += a[i];
            } else {
                res[1] += a[i];
            }
        }

        return res;
    }

}
