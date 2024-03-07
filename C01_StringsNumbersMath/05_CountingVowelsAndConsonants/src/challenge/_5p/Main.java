package challenge._5p;

import challenge._1p.DisplayExecTime;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(Solution.countingVowelsAndConsonants("Abcdefghijklmnopqrstuvwxyz"));
        DisplayExecTime.displayExecutionTime(System.nanoTime() - startTime);
    }
}
