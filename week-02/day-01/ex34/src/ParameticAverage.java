import java.util.Scanner;

public class ParameticAverage {
    public static void main(String[] args) {
        System.out.println("Please type in 5 numbers: ");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        int number3 = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        int number4 = input4.nextInt();

        Scanner input5 = new Scanner(System.in);
        int number5 = input5.nextInt();

        System.out.println("Sum: " + (number1 + number2 + number3 + number4 + number5));
        System.out.println("Average: " + ((number1 + number2 + number3 + number4 + number5)/5));
    }
}
