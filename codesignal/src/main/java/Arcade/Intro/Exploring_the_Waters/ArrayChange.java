package Arcade.Intro.Exploring_the_Waters;

public class ArrayChange {

    public static void main(String[] args) {
        int[] a = new int[]{-1000, 0, -2, 0};

        System.out.println(arrayChange(a));
    }

    private static int arrayChange(int[] a) {
        int add = 0;

        for (int i = 0; i < a.length-1; i++) {
            if (a[i] >= a[i + 1]) {
                add += a[i] - a[i + 1] + 1;
                a[i + 1] += a[i] - a[i + 1] + 1;
            }
        }
        return add;
    }


}
