package Problems;

public class p050_Pow {

    public static double myPow(double x, int n) {
        double result = x;

        // early return when n == 0 and x == 1
        if (n == 0 || x == 1) {
            return 1;
        }

        boolean isNegativePow = n < 0;
        if (n < 1) {
            n = n * (-1);
        }

        // early return when next to integer limit
        if (n < 0 && x >= 0) {
            return 0;
        } else if (n < 0 && x < 0) {
            return 1;
        }

        if (x == -1) {
            return n % 2 == 0 ? 1 : -1;
        }

        while (n > 1) {
            result *= x;
            n--;
        }

        if (isNegativePow) {
            result = 1 / result;
        }

        return result;
    }


    public static void main(String[] args) {
//        System.out.println(myPow(2,10));
//        System.out.println(myPow(2, 0));
        System.out.println(myPow(-1, 2147483647));
//        System.out.println(myPow(2,-2));
    }
}
