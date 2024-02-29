package challenge._2p;

import challenge._1p.DisplayExecTime;

public class Main {
    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    // Ӝ -> Unicode: \u04DC, Code Point: 1244
    // 💕 -> Unicode: \uD83D\uDC95, Code Point: 128149
    private static final String TEXT_CP = "😍 💕 I Ӝ love you Ӝ so much 😍";

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        char res = Solution.findFirstUniqueChar(TEXT);
        DisplayExecTime.displayExecutionTime(System.nanoTime() - startTime);
        System.out.println(res);

        startTime = System.nanoTime();
        String s = Solution.findFirstUniqueCodePoint(TEXT_CP);
        DisplayExecTime.displayExecutionTime(System.nanoTime() - startTime);
        System.out.println(s);
    }
}
