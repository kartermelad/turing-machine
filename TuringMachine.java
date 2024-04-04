import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * The turing machine
 * 
 * @author Karter Melad & Hunter Walp
 * @version Spring 2024
 */
public class TuringMachine {
    Map<Pair, Transition> transitions = new HashMap<>();
    List<Integer> tape = new LinkedList<>();
    int currentState = 0;
    int head = 0;

    public void loadFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        int numStates = Integer.parseInt(reader.readLine());
        int numSymbols = Integer.parseInt(reader.readLine());
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
        while (currentState != transitions.size() / 2) {
            int currentSymbol = tape.get(head);
            Transition transition = transitions.get(new Pair(currentState, currentSymbol));
            if (transition == null) {
                return;
            }
            tape.set(head, transition.writeSymbol);
            currentState = transition.nextState;
            if (transition.moveDirection.equals("R")) {
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
        for (int symbol : tape) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}
