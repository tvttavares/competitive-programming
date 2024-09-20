package Arcade.Intro.Through_the_Fog;

public class CircleOfNumbers {

    public static void main(String[] args) {
        int n = 10;
        int firstNumber = 5;
        System.out.println(oppositeNumber(n, firstNumber));
    }

    private static int oppositeNumber(int n, int firstNumber) {
        int middle = n / 2;
        int res = middle + firstNumber;
        if (res >= n) res = res - n;
        return res;
    }
}
