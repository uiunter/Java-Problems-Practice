package challenge._4p;

import challenge._1p.DisplayExecTime;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(Solution.containsOnlyDigits("Sfdsgfdbfd"));
        DisplayExecTime.displayExecutionTime(System.nanoTime() - startTime);

        startTime = System.nanoTime();
        System.out.println(Solution.containsOnlyDigitsV2("Sfdsgfdbfd"));
        DisplayExecTime.displayExecutionTime(System.nanoTime() - startTime);
    }
}
