package Regex.CharacterClass;

import Regex.Regex_Test;

public class MatchingCharacterRanges {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[a-z][1-9][^a-z][^A-Z][A-Z]"); // Use \\ instead of using \

    }
}
