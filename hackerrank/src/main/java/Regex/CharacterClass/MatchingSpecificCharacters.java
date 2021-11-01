package Regex.CharacterClass;

import Regex.Regex_Test;

public class MatchingSpecificCharacters {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[1-3][0-2][xs0][30Aa][xsu][.,]$"); // Use \\ instead of using \

    }
}
