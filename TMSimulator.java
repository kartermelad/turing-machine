import java.io.IOException;

/**
 * TMSimulator runs and executes the machine with main
 * 
 * @author Karter Melad & Hunter Walp
 * @version Spring 2024
 */
public class TMSimulator {
    public static void main(String[] args) throws IOException {
        TM tm = new TM();
        tm.loadFromFile(args[0]);
        long startTime = System.nanoTime();
        tm.start();
        tm.printTape();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;  // Convert to milliseconds
        System.out.println("Execution time: " + duration + " ms");
    }
}
