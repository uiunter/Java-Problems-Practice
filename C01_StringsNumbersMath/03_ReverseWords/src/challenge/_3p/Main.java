package challenge._3p;

import challenge._1p.DisplayExecTime;

public class Main {
    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(Solution.reverseWords(TEXT));
        DisplayExecTime.displayExecutionTime((System.nanoTime() - startTime));
    }
}
