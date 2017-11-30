import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Please write a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();


        String star = "";

        for (int i = 0; i<(number+1); i++) {
            star = star + "*";
            System.out.println(star);
        }
    }
}
