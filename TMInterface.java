import java.io.IOException;

/**
 * TMInterface is an interface for a Turing Machine.
 * It defines the methods needed to run that a Turning
 * Machine should implement
 * 
 * @author Karter Melad & Hunter Walp
 * @version Spring 2024
 */
public interface TMInterface {
    /**
     * Loads a Turing Machine from a file.
     * @param filename the name of the file
     * @throws IOException if an I/O error occurs
     */
    public void loadFromFile(String filename) throws IOException;

    /**
     * Starts the Turing Machine.
     */
    public void start();

    /**
     * Prints the current state of the tape.
     */
    public void printTape();
}
