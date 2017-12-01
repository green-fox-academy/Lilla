import java.util.ArrayList;
import java.util.Scanner;

public class FindTheSubstring {
    public static void main(String[] args) {
        System.out.println("please enter a sentence: ");
        Scanner scanner1 = new Scanner(System.in);
        ArrayList <String> sentence = new ArrayList<> ();
        while (scanner1.hasNext()) {
            sentence.add(scanner1.next());
            break;
        }

        System.out.println("Please enter a word from you sentence: ");
        Scanner scanner2 = new Scanner(System.in);
        String word = scanner2.next();

        int index = sentence.indexOf(word);
        System.out.println(index);
    }
}
