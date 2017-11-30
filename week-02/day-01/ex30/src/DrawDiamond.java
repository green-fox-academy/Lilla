import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        for (int i = 0; i < number ; i++) {
            for (int j = number - i -1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i +1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = number -1; i > -1; i--) {
            for (int j = number - i -1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
