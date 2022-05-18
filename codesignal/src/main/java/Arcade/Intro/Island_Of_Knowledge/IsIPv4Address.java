package Arcade.Intro.Island_Of_Knowledge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsIPv4Address {

    public static void main(String[] args) {
        String s = "172.16.254.1";

        System.out.println(isIPv4Address(s));
    }

    private static boolean isIPv4Address(String inputString) {
        if (inputString == null) {
            return false;
        }

        String ipva4_regex = "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\." +
                "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])$";

        Matcher matcher = Pattern.compile(ipva4_regex).matcher(inputString);

        return matcher.matches();
    }


}
