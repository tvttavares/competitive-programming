package Regex.Introduction;

import Regex.Regex_Test;

public class MatchingWordENonWordCharacter {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("\\w\\w\\w\\W\\w\\w\\w\\w\\w\\w\\w\\w\\w\\w\\W\\w\\w\\w"); // Use \\ instead of using \

    }
}