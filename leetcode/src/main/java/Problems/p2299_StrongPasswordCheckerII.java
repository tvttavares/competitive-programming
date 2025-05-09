package Problems;

public class p2299_StrongPasswordCheckerII {

    public static boolean strongPasswordCheckerII(String password) {

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasAdjacent = false;

        if (password.length() < 8) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!hasLower && Character.isLowerCase(c)) hasLower = true;
            if (!hasUpper && Character.isUpperCase(c)) hasUpper = true;
            if (!hasDigit && Character.isDigit(c)) hasDigit = true;
            if (!hasSpecial && !Character.isLetterOrDigit(c)) hasSpecial = true;

            if (i > 0) {
                char c1 = password.charAt(i - 1);
                if (c1 == c) {
                    hasAdjacent = true;
                }
            }
        }

        return hasLower && hasUpper && hasDigit && hasSpecial && !hasAdjacent;
    }

    public static void main(String[] args) {
        System.out.println(strongPasswordCheckerII("aA0!bB1@@3rbHkB8Puvl"));
    }
}
