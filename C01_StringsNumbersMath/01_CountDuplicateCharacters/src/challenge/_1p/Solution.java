package challenge._1p;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<Character, Integer> countDuplicates(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        if (str == null) throw new IllegalArgumentException();

        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }
        return hm;
    }

    public static Map<String, Integer> countCodePoints(String str) {
        Map<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); ) {
            int codePoint = str.codePointAt(i);
            hm.put(String.valueOf(Character.toChars(codePoint)),
                hm.getOrDefault(
                    String.valueOf(Character.toChars(codePoint)),
                    0
                ) + 1);
            i += Character.charCount(codePoint);
        }
        return hm;
    }
}
