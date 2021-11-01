package Regex;

public class MatchingDigitsENonDigitCharacters {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d"); // Use \\ instead of using \

    }
}
