package Regex.GroupingAndCapturing;

import Regex.Regex_Test;

public class AlternativeMatching {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^(Mr|Mrs|Ms|Dr|Er)\\.[A-Za-z]+$"); // Use \\ instead of using \

    }

}
