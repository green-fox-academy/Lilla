import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please write a word here: ");
        String word1 = input1.next();

        System.out.println("Please write a word here: ");
        String word2 = input1.next();

        String [] word1Array = word1.split ("");
        List <String> word1List= Arrays.asList(word1Array);


        String [] word2Array = word2.split ("");
        List <String> word2List= Arrays.asList(word2Array);

        if (word1List.containsAll(word2List)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
