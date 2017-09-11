import FibonacciGenerator.FibonacciGenerator;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

public class FibonacciGeneratorTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void firstNumIsZero() throws Exception {

        assertEquals(0, new FibonacciGenerator().getNumAtPosition(0));
    }

    @Test
    public void secondNumIsOne() throws Exception {

        assertEquals(1, new FibonacciGenerator().getNumAtPosition(1));
    }

    @Test
    public void thirdNumIsOne() throws Exception {

        assertEquals(1, new FibonacciGenerator().getNumAtPosition(2));
    }

    @Test
    public void sixthNumIs() throws Exception {

        assertEquals(5, new FibonacciGenerator().getNumAtPosition(5));
    }
}
