package classes;

public class NumberTester {
    // This class may be used to test if a number is odd or even
    // It works by performing a Modulo 2 operation on a given number

    public boolean isOdd(int n) {
        // Determine if number is odd
        int remainder = n % 2;  // Will return the remainder of the
        // division of n by 2

        // Return true if remainder != 0 (odd number)
        // Otherwise return false
        return remainder != 0;
    }
}
