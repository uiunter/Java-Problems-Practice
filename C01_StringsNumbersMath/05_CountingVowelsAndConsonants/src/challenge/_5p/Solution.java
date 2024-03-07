package challenge._5p;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public static AbstractMap.SimpleEntry<Long, Long> countingVowelsAndConsonants(String str) {
        long vowels = str.toLowerCase().chars()
                .filter(c -> allVowels.contains((char) c))
                .count();

        long consonants = str.toLowerCase().chars()
                .filter(c -> !allVowels.contains((char) c))
                .filter(c -> c >= 'a' && c <= 'z')
                .count();

        return new AbstractMap.SimpleEntry<>(vowels, consonants);
    }
}
