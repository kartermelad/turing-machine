import java.util.ArrayList;
import java.util.List;

/**
 * TMTape class represents the tape of a
 * Turing Machine.
 * 
 * @author Karter Melad & Hunter Walp
 */
public class TMTape {

    private List<Integer> positiveSymbols = new ArrayList<>();
    private List<Integer> negativeSymbols = new ArrayList<>();

    /**
     * Adds a symbol
     * @param symbol
     */
    public void add(int index, int symbol) {
        if (index >= 0) {
            while (positiveSymbols.size() <= index) {
                positiveSymbols.add(0);
            }
            positiveSymbols.set(index, symbol);
        } else {
            index = -index - 1;
            while (negativeSymbols.size() <= index) {
                negativeSymbols.add(0);
            }
            negativeSymbols.set(index, symbol);
        }
    }

    /**
     * Gets the index
     * @param index
     * @return
     */
    public int get(int index) {
        if (index >= 0) {
            return index < positiveSymbols.size() ? positiveSymbols.get(index) : 0;
        } else {
            index = -index - 1;
            return index < negativeSymbols.size() ? negativeSymbols.get(index) : 0;
        }
    }

    /**
    * Sets the symbol at a given index.
    * @param index the index to set the symbol at
    * @param symbol the symbol to set
     */
    public void set(int index, int symbol) {
        if (index >= 0) {
            while (positiveSymbols.size() <= index) {
                positiveSymbols.add(0);
            }
            positiveSymbols.set(index, symbol);
        } else {
            index = -index - 1;
            while (negativeSymbols.size() <= index) {
                negativeSymbols.add(0);
            }
            negativeSymbols.set(index, symbol);
        }
    }

    /**
     * Gets the size of the tape.
     * @return the size of the tape
     */
    public int size() {
        // The size of the tape is the sum of the sizes of the positiveSymbols and negativeSymbols lists
        return positiveSymbols.size() + negativeSymbols.size();
    }

    /**
    * Prints the tape.
    */
    public void print() {
        // Print the negativeSymbols list in reverse order, because the leftmost symbol has the highest negative index
        for (int i = negativeSymbols.size() - 1; i >= 0; i--) {
            System.out.print(negativeSymbols.get(i));
        }
        // Print the positiveSymbols list in normal order
        for (int symbol : positiveSymbols) {
            System.out.print(symbol);
        }
    System.out.println();
    }
}
