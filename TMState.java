/**
 * The TMState class represents a state in
 * a Turing Machine.
 * 
 * @author Karter Melad & Hunter Walp
 */
public class TMState {
    private int state;
    private Transition transition;

    public TMState(int state, Transition transition) {
        this.state = state;
        this.transition = transition;
    }

    /**
     * Gets the state
     * @return state
     */
    public int getState() {
        return state;
    }

    /**
     * Sets the state
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * Gets the transition
     * @return
     */
    public Transition getTransition() {
        return transition;
    }

    /**
     * Sets the transition
     * @param transition
     */
    public void setTransition(Transition transition) {
        this.transition = transition;
    }
}