import java.util.Scanner;

public class DrawRectangle {
    public static void main(String[] args) {
        System.out.println("Please write a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.print("%%%%%");
        System.out.println("");
        for (int i = 1; i < number + 1; i++) {
            System.out.println("%" + " " + " " + " " + "%");
        }
        System.out.print("");

        System.out.print("%%%%%");
    }
}
