import java.util.ArrayList;
import java.util.Scanner;

public class FindTheSubstring {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence: ");
        Scanner scanner1 = new Scanner(System.in);
        String sentence = scanner1.nextLine();
        System.out.println(sentence);

        System.out.println("Please enter a word from you sentence: ");
        Scanner scanner2 = new Scanner(System.in);
        String word = scanner2.next();

        System.out.println(sentence.indexOf(word));
    }
}
