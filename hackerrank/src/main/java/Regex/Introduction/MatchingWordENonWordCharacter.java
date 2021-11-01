package Regex.Introduction;

import Regex.Regex_Test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingWordENonWordCharacter {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("\\w\\w\\w\\W\\w\\w\\w\\w\\w\\w\\w\\w\\w\\w\\W\\w\\w\\w"); // Use \\ instead of using \

    }
}