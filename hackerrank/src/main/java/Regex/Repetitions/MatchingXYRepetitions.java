package Regex.Repetitions;

import Regex.Regex_Test;

public class MatchingXYRepetitions {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[\\d]{1,2}[a-zA-Z]{3,}\\.{0,3}$"); // Use \\ instead of using \

    }
}
