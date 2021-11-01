package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingStartEEnd {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^\\d\\w\\w\\w\\w\\.$"); // Use \\ instead of using \

    }
}
