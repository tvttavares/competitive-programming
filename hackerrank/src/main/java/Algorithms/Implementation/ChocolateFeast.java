package Algorithms.Implementation;

public class ChocolateFeast {

    public static int chocolateFeast(int n, int c, int m) {
        int nc = n / c;
        int res = nc;

        int tr = nc / m;
        nc = nc - (tr * m) + tr;
        res += tr;

        while (nc >= m) {
            tr = nc / m;
            nc = nc - (tr * m) + tr;
            res += tr;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(chocolateFeast(6, 2, 2));
    }
}
