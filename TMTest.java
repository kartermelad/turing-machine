import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;


public class TMTest {
    private TM tm;

    @BeforeEach
    public void setUp() {
        tm = new TM();
    }

    @Test
    public void testLoadFromFile() throws IOException {
        tm.loadFromFile("path_to_your_file.txt");
        // Add assertions here to check that the TM was loaded correctly
        // For example, you might check that the currentState, finalState, and transitions map are not null
        assertNotNull(tm.currentState);
        assertNotNull(tm.finalState);
        assertNotNull(tm.transitions);
    }

    @Test
    public void testStart() throws IOException {
        tm.loadFromFile("path_to_your_file.txt");
        tm.start();
        // Add assertions here to check that the TM executed correctly
        // For example, you might check that the currentState is the finalState
        assertEquals(tm.finalState, tm.currentState);
    }
}