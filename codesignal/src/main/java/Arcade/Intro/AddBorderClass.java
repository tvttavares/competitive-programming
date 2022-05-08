package Arcade.Intro;

import java.util.Arrays;

public class AddBorderClass {

    public static void main(String[] args) {
//        String[] a = new String[]{"abc", "ded"};
        String[] a = new String[]{"a"};

        System.out.println(Arrays.toString(addBorder(a)));
    }

    private static String[] addBorder(String[] a) {

        String[] res = new String[a.length + 2];

        for (int i = 0; i < a.length + 2; i++) {
            res[i] = "";
            for (int j = 0; j < a[0].length() + 2; j++) {
                if (i == 0 || i == a.length + 1) {
                    res[i] += "*";
                }
            }
            if (i != 0 && i != a.length + 1) {
                res[i] = "*" + a[i - 1] + "*";
            }
        }


        return res;
    }
}
