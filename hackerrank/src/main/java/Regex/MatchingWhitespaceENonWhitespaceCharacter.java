package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingWhitespaceENonWhitespaceCharacter {

    public static void main(String[] args) {

        Regex_Test3 tester = new Regex_Test3();
        tester.checker("\\S\\S\\s\\S\\S\\s\\S\\S"); // Use \\ instead of using \

    }
}

class Regex_Test3 {

    public void checker(String Regex_Pattern) {

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }

}