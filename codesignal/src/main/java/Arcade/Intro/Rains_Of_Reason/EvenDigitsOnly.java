package Arcade.Intro.Rains_Of_Reason;

public class EvenDigitsOnly {

    public static void main(String[] args) {
        int number = 2486222;
        System.out.println(evenDigitsOnly(number));
    }

    private static boolean evenDigitsOnly(int number) {
        String stringNumber = String.valueOf(number);
        boolean isEven = true;

        for (char c : stringNumber.toCharArray()) {
            if ((int) c % 2 != 0) {
                isEven = false;
                break;
            }
        }

        return isEven;
    }
}
