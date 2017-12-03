import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please write a word here: ");
        String word1 = input1.next();

        System.out.println("Please write a word here: ");
        String word2 = input1.next();
        anagram(word1,word2);

    }

    public static void anagram (String picture, String puzzle ){
        String [] word1Array = picture.split ("");
        List <String> word1List= Arrays.asList(word1Array);

        String [] word2Array = puzzle.split ("");
        List <String> word2List= Arrays.asList(word2Array);

        if (word1List.containsAll(word2List)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
