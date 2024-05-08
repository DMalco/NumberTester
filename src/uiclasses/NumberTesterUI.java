package uiclasses;

import classes.NumberTester;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberTesterUI {

    // Variables for reading and writing
    private static final InputStreamReader reader =
            new InputStreamReader(System.in);
    private static final BufferedReader input =
            new BufferedReader(reader);
    private static int number = 0;

    public static void main(String[] args) {
        NumberTester nt = new NumberTester();
        // Read a number from the keyboard
        getInput();

        // Determine if number is odd or even
        if(nt.isOdd(number)) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }
    }

    private static void getInput() {
        System.out.print("Please enter an integer: ");
        try {
            number = Integer.parseInt(input.readLine());
        } catch(IOException io) {
            System.out.print("An error occurred: " + io.getMessage());
        } catch(NumberFormatException nf) {
            System.out.println("Invalid input!");
            getInput();
        }
    }
}
