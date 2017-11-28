import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        System.out.println("Please write a number: ");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();

        System.out.println("Please write an other number: ");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();

        if (number1 > number2) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = number1; i < number2; i++) {
                System.out.println(i);
            }
        }
    }
}
