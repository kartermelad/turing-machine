import java.util.ArrayList;
import java.util.List;

/**
 * TMTape class represents the tape of a
 * Turing Machine.
 * 
 * @author Karter Melad & Hunter Walp
 */
public class TMTape {
    private List<Integer> symbols = new ArrayList<>();

    /**
     * Adds a symbol
     * @param symbol
     */
    public void add(int symbol) {
        symbols.add(symbol);
    }

    /**
     * Adds a symbol to a given index
     * @param index
     * @param symbol
     */
    public void add(int index, int symbol) {
        symbols.add(index, symbol);
    }

    /**
     * Gets the index
     * @param index
     * @return
     */
    public int get(int index) {
        return symbols.get(index);
    }

    /**
     * Sets the symbol at a given index
     * @param index
     * @param symbol
     */
    public void set(int index, int symbol) {
        symbols.set(index, symbol);
    }

    /**
     * Gets the size of the list
     * @return size
     */
    public int size () {
        return symbols.size();
    }

    /**
     * Prints the list
     */
    public void print() {
        for (int symbol : symbols) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
