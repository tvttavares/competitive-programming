package Arcade.Intro;

public class IsLuckyClass {

    public static void main(String[] args) {
        int n = 1230;
        System.out.println(isLucky(n));

        n =239017;
        System.out.println(isLucky(n));
    }

    private static boolean isLucky(int n) {
        char[] c = String.valueOf(n).toCharArray();
        int len = c.length;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < len / 2; i++) {
            sum1 += Integer.parseInt(String.valueOf(c[i]));
            sum2 += Integer.parseInt(String.valueOf(c[i + len / 2]));
        }

        return sum1 == sum2;
    }
}

