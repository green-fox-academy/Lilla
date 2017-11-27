import java.util.Scanner;

public class AnimalAndLegs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of your chickens: ");
        int chickensNumber = input.nextInt();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the number of your pigs: ");
        int pigsNumber = userInput.nextInt();

        System.out.println(chickensNumber * 2 + pigsNumber * 4);

    }
}
