package Arcade.Intro.Through_the_Fog;

public class DepositProfit {

    public static void main(String[] args) {
        int deposit = 100;
        int rate = 20;
        int threshold = 170;
        System.out.println(profit(deposit, rate, threshold));
    }

    private static int profit(int deposit, int rate, int threshold) {
        return (int) Math.ceil(Math.log((double) threshold / (double) deposit) / Math.log(1 + (double) rate / 100));
    }
}
