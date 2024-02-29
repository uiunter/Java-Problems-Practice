package challenge._1p;

import java.util.Arrays;
import java.util.Map;

public class Main {
    private static final String TEXT = "Be strong, be fearless, be beautiful. "
            + "And believe that anything is possible when you have the right "
            + "people there to support you. ";
    private static final String TEXT_CP = TEXT + "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";

    public static void main(String[] args) {
        System.out.println("Input text: \n" + TEXT + "\n");

        System.out.println("\n\nASCII or 16 bits Unicode characters (less than 65,535 (0xFFFF)) examples:\n");

        long startTime = System.nanoTime();
        Map<Character, Integer> m = Solution.countDuplicates(TEXT);
        DisplayExecTime.displayExecutionTime(System.nanoTime() - startTime);
        System.out.println(Arrays.toString(m.entrySet().toArray()));

        startTime = System.nanoTime();
        Map<String, Integer> mcp = Solution.countCodePoints(TEXT_CP);
        DisplayExecTime.displayExecutionTime(System.nanoTime() - startTime);
        System.out.println(Arrays.toString(mcp.entrySet().toArray()));
    }
}
