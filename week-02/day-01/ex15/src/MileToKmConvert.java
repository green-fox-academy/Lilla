import java.util.Scanner;

public class MileToKmConvert {
    public static void main(String[] args) {
        System.out.println("Distance in kilometer");
        Scanner input = new Scanner(System.in);
        int km = input.nextInt();

        System.out.println(km * 0.621371192);

    }
}
