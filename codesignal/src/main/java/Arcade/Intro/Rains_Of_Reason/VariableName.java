package Arcade.Intro.Rains_Of_Reason;

public class VariableName {

    public static void main(String[] args) {
        String name = "var_1__Int";
        System.out.println(isValidString(name));
    }

    private static boolean isValidString(String name) {
        if (name == null || name.isEmpty()) {
            return false;
        }

        // Check if the first character is not a letter or underscore
        char firstChar = name.charAt(0);
        if (!Character.isLetter(firstChar) && firstChar != '_') {
            return false;
        }

        // Check the rest of the characters
        for (int i = 1; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            if (!Character.isLetterOrDigit(currentChar) && currentChar != '_') {
                return false;
            }
        }

        return true;
    }
}
