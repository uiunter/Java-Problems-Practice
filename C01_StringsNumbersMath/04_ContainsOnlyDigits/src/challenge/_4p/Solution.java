package challenge._4p;

public class Solution {
    public static boolean containsOnlyDigits(String str) {
        return str.matches("[0-9]+");
    }

    public static boolean containsOnlyDigitsV2(String str) {
        return str.chars()
                .allMatch(Character::isDigit);
    }
}
