package Problems;

public class p342_PowerOfFour {

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(1));
    }
}
