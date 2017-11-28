import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner number1 = new Scanner(System.in);
        int a = number1.nextInt();
        System.out.println("Enter number:");
        Scanner number2 = new Scanner(System.in);
        int b = number2.nextInt();
        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}
