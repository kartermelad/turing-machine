public class TMState {
    private int state;
    private Transition transition;

    public TMState(int state, Transition transition) {
        this.state = state;
        this.transition = transition;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Transition getTransition() {
        return transition;
    }

    public void setTransition(Transition transition) {
        this.transition = transition;
    }
}