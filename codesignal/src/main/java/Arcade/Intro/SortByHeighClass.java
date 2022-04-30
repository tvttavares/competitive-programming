package Arcade.Intro;

import java.util.Arrays;

public class SortByHeighClass {

    public static void main(String[] args) {
        int[] a = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
//        int[] a = new int[]{-1, 150, 160, 170, -1, -1, 180, 190};

        System.out.println(Arrays.toString(solution(a)));
    }

    public static int[] solution(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int tmp;
                if (a[i] > a[j] && a[i] != -1 && a[j] != -1) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }

}
