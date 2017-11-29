import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Please type in the expression:");
        Scanner input1 = new Scanner (System.in);
        String operation = input1.next();
        Scanner input2 = new Scanner (System.in);
        Integer number1 = input2.nextInt();
        Scanner input3 = new Scanner (System.in);
        Integer number2 = input3.nextInt();

        if (operation.equals("+")){
            System.out.println(number1 + number2);
        } else if ( operation.equals("-")) {
            System.out.println(number1 - number2);
        } else if ( operation.equals("*")) {
            System.out.println(number1 * number2);
        } else if ( operation.equals("/")) {
            System.out.println(number1 / number2);
        } else if ( operation.equals("%")) {
            System.out.println(number1 % number2);
        } else {
            System.out.println("error");
        }
    }
}
