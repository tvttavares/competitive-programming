package Algorithms.Implementation;

public class StringsConstructionClass {

    public static void main(String[] args) {
        System.out.println(stringsConstruction("abc", "abccba"));
    }

    public static int stringsConstruction(String a, String b) {
        StringBuilder bb = new StringBuilder(b);
        int pos, count = 0;
        boolean found = true;
        while (found) {
            for (int i = 0; i < a.length(); i++) {
                pos = bb.indexOf(String.valueOf(a.charAt(i)));
                if (pos >= 0) {
                    bb.deleteCharAt(pos);
                } else {
                    found = false;
                    break;
                }
            }
            if (found) count++;
        }
        return count;
    }
}