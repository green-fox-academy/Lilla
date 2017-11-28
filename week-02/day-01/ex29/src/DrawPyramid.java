import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        System.out.println("Please write a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 0; i < number; i ++) {
            for ( int j = 0; j < number; j++) {
            System.out.print("*");
            }

        }
    }
}

