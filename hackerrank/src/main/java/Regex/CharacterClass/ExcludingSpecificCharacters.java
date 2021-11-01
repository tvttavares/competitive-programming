package Regex.CharacterClass;

import Regex.Regex_Test;

public class ExcludingSpecificCharacters {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[^\\\\d][^aeiou][^bcDF][^\\\\W][^AEIOU][^.,]$"); // Use \\ instead of using \

    }

}
