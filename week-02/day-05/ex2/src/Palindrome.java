import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a word here: ");
        String word = scan.next();
        System.out.println(palindrom(word));

    }

    public static String palindrom (String kacsa){

        String [] wordArray = kacsa.split ("");
        List <String> wordList= Arrays.asList(wordArray);
        for (int i = 0; i <wordList.size() ; i++) {
            kacsa = kacsa + wordList.get(wordList.size() - i -1);
        }
        return kacsa;
    }
}
