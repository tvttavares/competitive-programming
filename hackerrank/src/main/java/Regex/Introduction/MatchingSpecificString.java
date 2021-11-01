package Regex.Introduction;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificString {
    public static void main(String[] args) {

        Regex_Test_Numder_Of_Matches tester = new Regex_Test_Numder_Of_Matches();
        tester.checker("hackerrank");

    }
}

class Regex_Test_Numder_Of_Matches {

    public void checker(String Regex_Pattern) {

        Scanner Input = new Scanner(System.in);
        String Test_String = Input.nextLine();
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        int Count = 0;
        while (m.find()) {
            Count += 1;
        }
        System.out.format("Number of matches : %d", Count);
    }

}