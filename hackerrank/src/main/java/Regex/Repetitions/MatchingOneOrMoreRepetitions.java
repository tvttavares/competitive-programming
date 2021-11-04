package Regex.Repetitions;

import Regex.Regex_Test;

public class MatchingOneOrMoreRepetitions {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[\\d]+[A-Z]+[a-z]+$"); // Use \\ instead of using \

    }
}
