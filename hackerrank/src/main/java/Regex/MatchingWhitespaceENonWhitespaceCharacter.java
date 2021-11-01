package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingWhitespaceENonWhitespaceCharacter {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("\\S\\S\\s\\S\\S\\s\\S\\S"); // Use \\ instead of using \

    }
}
