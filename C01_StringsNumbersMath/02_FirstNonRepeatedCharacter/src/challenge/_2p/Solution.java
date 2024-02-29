package challenge._2p;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static char findFirstUniqueChar(String str) {
        if (str == null || str.isBlank()) throw new IllegalArgumentException();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }

        }
        return '\0';
    }

    public static String findFirstUniqueCodePoint(String str) {
        if (str == null || str.isBlank()) throw new IllegalArgumentException();
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); ) {
            int codePoint = str.codePointAt(i);
            map.put(String.valueOf(Character.toChars(codePoint)),
                    map.getOrDefault(
                            String.valueOf(Character.toChars(codePoint)),
                            0
                    ) + 1);
            i += Character.charCount(codePoint);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }
}
