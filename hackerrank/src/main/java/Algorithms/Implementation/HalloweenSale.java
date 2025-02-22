package Algorithms.Implementation;

public class HalloweenSale {

    public static int howManyGames(int p, int d, int m, int s) {
        int maxGames = 0;
        int cost = 0;
        int pp = 0;

        while (cost < s) {
            if (p > s) {
                break;
            }

            pp = p;
            if (p <= m) {
                p = m;
            } else {
                if (p - d <= m) {
                    p = m;
                } else {
                    p = p - d;
                }
            }

            if (cost + pp > s) {
                break;
            }
            maxGames++;
            cost = cost + pp;
        }
        return maxGames;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 80));
    }
}
