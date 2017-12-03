import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;

        while (true) {
            System.out.print("Pick a number between 1-10: ");
            int userNumber = scan.nextInt();
            if (userNumber == randomNumber) {
                System.out.println("Excellent! You have won!");
                break;
            } else if (userNumber > randomNumber) {
                System.out.println("Too Big");
            } else if (userNumber < randomNumber) {
                System.out.println("Too Small");
            }
        }
    }
}

