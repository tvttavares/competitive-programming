package Regex.Repetitions;

import Regex.Regex_Test;

public class MatchingXRepetitions {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[a-zA-Z02468]{40}[13579\\\\s]{5}$"); // Use \\ instead of using \

    }
}
