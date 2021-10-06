package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingStartEEnd {

    public static void main(String[] args) {

        Regex_Test5 tester = new Regex_Test5();
        tester.checker("^\\d\\w\\w\\w\\w\\.$"); // Use \\ instead of using \

    }
}

class Regex_Test5 {

    public void checker(String Regex_Pattern) {

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}