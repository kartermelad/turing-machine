/**
 * Represents a transition in the Turing Machine
 * 
 * @author Karter Melad & Hunter Walp
 * @version Spring 2024
 */
public class Transition {
    int nextState;
    int writeSymbol;
    String moveDirection;

    public Transition(int nextState, int writeSymbol, String moveDirection) {
        this.nextState = nextState;
        this.writeSymbol = writeSymbol;
        this.moveDirection = moveDirection;
    }

    /**
     * Gets the next state
     * @return next state
     */
    public int getNextState() {
        return nextState;
    }

    /**
     * Gets the symbol
     * @return symbol
     */
    public int getWriteSymbol() {
        return writeSymbol;
    }

    /**
     * Gets the move direction
     * @return direction
     */
    public String getMoveDirection() {
        return moveDirection;
    }
}
