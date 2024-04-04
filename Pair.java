import java.util.Objects;

/**
 * Holds the state and symbol
 * 
 * @author Karter Melad & Hunter Walp
 * @version Spring 2024
 */
public class Pair {
    int state;
    int symbol;

    public Pair(int state, int symbol) {
        this.state = state;
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pair pair = (Pair) o;
        return state == pair.state && symbol == pair.symbol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, symbol);
    }
}
