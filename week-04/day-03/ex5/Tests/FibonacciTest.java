import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void createFibo() throws Exception {
        Fibonacci sequence = new Fibonacci();
        int number = 7;
        assertEquals(8, sequence.createFibo(number));
    }

}