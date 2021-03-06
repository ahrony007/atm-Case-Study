// Keypad.java
// Represents the keypad of the ATM

package atmImplementation;

import java.util.Scanner;

public class Keypad {
    private Scanner input;
    
    // no-argument constructor initializes the Scanner
    public Keypad() {
        input = new Scanner(System.in);
    }
    
    // return an integer value entered by user
    public int getInput() {
        return input.nextInt();
    }
}
