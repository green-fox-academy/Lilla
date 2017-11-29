
import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Please write a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
