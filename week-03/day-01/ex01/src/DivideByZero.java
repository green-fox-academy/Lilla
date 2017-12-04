import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int userInput = scan.nextInt();
        System.out.println(divideByZero(userInput));
    }

    private static int divideByZero(int divisor) {
       int result = 0;
        try {
            result = 10 / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Fail");
        }
        return result;
    }
}
