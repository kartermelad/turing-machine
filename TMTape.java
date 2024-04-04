import java.util.ArrayList;
import java.util.List;

public class TMTape {
    private List<Integer> symbols = new ArrayList<>();

    public void add(int symbol) {
        symbols.add(symbol);
    }

    public void add(int index, int symbol) {
        symbols.add(index, symbol);
    }

    public int get(int index) {
        return symbols.get(index);
    }

    public void set(int index, int symbol) {
        symbols.set(index, symbol);
    }

    public int size () {
        return symbols.size();
    }

    public void print() {
        for (int symbol : symbols) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
