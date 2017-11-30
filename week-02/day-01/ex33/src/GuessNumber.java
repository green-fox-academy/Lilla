import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int storedNumber = 8;

        System.out.println(" Which number did I think? Type in your guess: ");
        Scanner input = new Scanner(System.in);
        int usersGuess = input.nextInt();

        if (usersGuess < storedNumber) {
            System.out.println("The stored number is higher");
        } else if (usersGuess > storedNumber) {
            System.out.println("The stried number is lower");
        } else {
            System.out.println("You've found the number: " + storedNumber);
        }
    }
}
