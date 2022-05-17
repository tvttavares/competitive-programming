package Arcade.Intro.Island_Of_Knowledge;

public class AreEquallyStrong {

    public static void main(String[] args) {
        int yourLeft = 10;
        int yourRight = 15;
        int friendsLeft = 15;
        int friendsRight = 10;

        System.out.println(areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight));
    }

    private static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        return (yourLeft == friendsLeft && yourRight == friendsRight)
                || (yourLeft == friendsRight && yourRight == friendsLeft);
    }

}
