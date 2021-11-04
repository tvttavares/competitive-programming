package Regex.Repetitions;

import Regex.Regex_Test;

public class MatchingZeroOrMoreRepetitions {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[\\d]{2,}[a-z]*[A-Z]*$"); // Use \\ instead of using \

    }
}
