import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * The turing machine
 * 
 * @author Karter Melad & Hunter Walp
 * @version Spring 2024
 */
public class TM implements TMInterface {
    protected Map<Pair, Transition> transitions = new HashMap<>();
    protected TMTape tape = new TMTape();
    protected TMState currentState;
    protected TMState finalState;
    protected int head = 0;
    
    public void loadFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        int numStates = Integer.parseInt(reader.readLine());
        int numSymbols = Integer.parseInt(reader.readLine());
        currentState = new TMState(0, null);
        finalState = new TMState(numStates - 1, null);
        for (int state = 0; state < numStates - 1; state++) {
            for (int symbol = 0; symbol <= numSymbols; symbol++) {
                String[] parts = reader.readLine().split(",");
                transitions.put(new Pair(state, symbol), new Transition(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), parts[2]));
            }
        }
        String input = reader.readLine();
        if (input != null && !input.isEmpty()) {
            for (char c : input.toCharArray()) {
                tape.add(Character.getNumericValue(c));
            }
        } else {
            tape.add(0);  // Add a default symbol to the tape
        }
        reader.close();
    }

    public void start() {
        while (currentState.getState() != finalState.getState()) {
            int currentSymbol = tape.get(head);
            Transition transition = transitions.get(new Pair(currentState.getState(), currentSymbol));
            if (transition == null) {
                return;
            }
            tape.set(head, transition.getWriteSymbol());
            currentState = new TMState(transition.getNextState(), transition);
            if (transition.getMoveDirection().equals("R")) {
                head += 1;
            } else {
                head -= 1;
            }
            if (head < 0) {
                tape.add(0, 0);
                head = 0;
            } else if (head == tape.size()) {  // Only expand the tape when the head is at the end
                tape.add(0);  // Add a single 0 to the tape
            }
        }
    }

    public void printTape() {
        tape.print();
    }
}
