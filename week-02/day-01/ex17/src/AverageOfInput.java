import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        System.out.println("Please write an intiger: ");
        Scanner input1 = new Scanner (System.in);
        int intiger1 = input1.nextInt();

        System.out.println("Please write an intiger: ");
        Scanner input2 = new Scanner (System.in);
        int intiger2 = input2.nextInt();

        System.out.println("Please write an intiger: ");
        Scanner input3 = new Scanner (System.in);
        int intiger3 = input3.nextInt();

        System.out.println("Please write an intiger: ");
        Scanner input4 = new Scanner (System.in);
        int intiger4 = input4.nextInt();

        System.out.println("Please write an intiger: ");
        Scanner input5 = new Scanner (System.in);
        int intiger5 = input5.nextInt();

        System.out.println("Sum: " intiger1 + intiger2 + intiger3 + intiger4 + intiger5);
        System.out.println("Average: " (intiger1 + intiger2 + intiger3 + intiger4 + intiger5)/5);



    }
}
