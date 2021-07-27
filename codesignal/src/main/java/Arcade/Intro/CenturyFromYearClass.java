package Arcade.Intro;

public class CenturyFromYearClass {
    public static int centuryFromYear(int year) {

        int res = year / 100;
        int r = year % 100;

        if (r == 0) {
            return res;
        } else {
            return res + 1;
        }

    }

}
