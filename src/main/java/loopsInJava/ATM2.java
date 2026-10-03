package loopsInJava;

public class ATM2 {
    public static void main(String[] args) {
        int correctPin = 1234;
        int enteredPin = 1111;
        int attempts = 0;
        int maxAttempts = 3;
        while (enteredPin != correctPin && attempts < maxAttempts)
        {
            System.out.println("Incorrect PIN. Please try again.");
            attempts++;
            // Simulating another PIN entered by the user
            if (attempts == 1) {
                enteredPin = 2222;
            } else if (attempts == 2) {
                enteredPin = 2323;
//                 enteredPin = 1234;
            }
        }
        if (enteredPin == correctPin) {
            System.out.println("PIN correct. Welcome!");
        } else {
            System.out.println("ATM card blocked.");
        }
    }
}