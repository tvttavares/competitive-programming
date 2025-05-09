package Algorithms.Strings;

public class StrongPassword {

    public static int minimumNumber(Integer n, String password) {
        // Character sets for validation
        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()-+";

        // Flags for password conditions
        boolean hasNumber = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialCharacter = false;

        // Check each character in the password
        for (char c : password.toCharArray()) {
            if (!hasNumber && numbers.indexOf(c) >= 0) hasNumber = true;
            if (!hasLowerCase && lowerCase.indexOf(c) >= 0) hasLowerCase = true;
            if (!hasUpperCase && upperCase.indexOf(c) >= 0) hasUpperCase = true;
            if (!hasSpecialCharacter && specialCharacters.indexOf(c) >= 0) hasSpecialCharacter = true;

            // Exit early if all conditions are met
            if (hasNumber && hasLowerCase && hasUpperCase && hasSpecialCharacter) break;
        }

        // Calculate required additions for missing conditions
        int missingConditions = 0;
        if (!hasNumber) missingConditions++;
        if (!hasLowerCase) missingConditions++;
        if (!hasUpperCase) missingConditions++;
        if (!hasSpecialCharacter) missingConditions++;

        // Ensure password length meets minimum of 6
        int lengthShortfall = Math.max(0, 6 - password.length());

        // The result is the larger of missing conditions or length shortfall
        return Math.max(missingConditions, lengthShortfall);
    }

//    // Solution 1
//    public static int minimumNumber(int n, String password) {
//        String numbers = "0123456789";
//        String lower_case = "abcdefghijklmnopqrstuvwxyz";
//        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String special_characters = "!@#$%^&*()-+";
//        int min;
//
//        boolean isValidNumb = false, isValidNumbLenth = false, isValidlower = false, isValidUpper = false, isValidSpecial = false;
//        int passwordLenght = password.length();
//
//        if (passwordLenght > 6) {
//            isValidNumbLenth = true;
//        }
//
//        for (char c : password.toCharArray()) {
//            if (!isValidSpecial && special_characters.contains(String.valueOf(c))) {
//                isValidSpecial = true;
//            }
//            if (!isValidUpper && upper_case.contains(String.valueOf(c))) {
//                isValidUpper = true;
//            }
//            if (!isValidlower && lower_case.contains(String.valueOf(c))) {
//                isValidlower = true;
//            }
//            if (!isValidlower && lower_case.contains(String.valueOf(c))) {
//                isValidlower = true;
//            }
//            if (!isValidNumb && numbers.contains(String.valueOf(c))) {
//                isValidNumb = true;
//            }
//        }
//
//        int minSpecialConditions = (isValidSpecial ? 0 : 1) + (isValidUpper ? 0 : 1) + (isValidlower ? 0 : 1) + (isValidNumb ? 0 : 1);
//        int minNumber = isValidNumbLenth ? 0 : 6 - passwordLenght;
//
//        min = minNumber == 0 ? minSpecialConditions : minNumber >= minSpecialConditions ? minNumber : minSpecialConditions;
//        return min;
//    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(3, "2949148"));
    }
}
