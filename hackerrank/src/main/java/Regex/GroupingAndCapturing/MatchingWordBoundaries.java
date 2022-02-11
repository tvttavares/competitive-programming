package Regex.GroupingAndCapturing;

import Regex.Regex_Test;

public class MatchingWordBoundaries {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("\\\\b[AEIOUaeiou][A-Za-z]*\\\\b"); // Use \\ instead of using \

    }
}
