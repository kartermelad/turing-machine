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

    public int getNextState() {
        return nextState;
    }

    public int getWriteSymbol() {
        return writeSymbol;
    }

    public String getMoveDirection() {
        return moveDirection;
    }
}
