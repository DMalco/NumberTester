package tests;

import classes.NumberTester;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberTesterTests {
    NumberTester nt = new NumberTester();
    int oddNumber = 5;
    int evenNumber = 6;

    @Test
    public void oddTest() {
        // Test of a number is odd
        assertTrue(nt.isOdd(oddNumber));   // Should pass
    }

    @Test
    public void evenTest() {
        // Test if a number is even
        assertTrue(nt.isOdd(evenNumber));  // Should fail
    }
}
