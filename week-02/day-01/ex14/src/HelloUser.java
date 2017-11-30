import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String userName =  input.next();
        System.out.println("Hello, " + userName + "!");
    }
}
