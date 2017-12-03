import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please write a word here: ");
        String word = input1.next();

        String [] wordArray = word.split ("");
        List <String> wordList= Arrays.asList(wordArray);

        for (int i = 0; i <wordList.size() ; i++) {
            word = word + wordList.get(wordList.size() - i -1);
        }
        System.out.println(word);



        /**     String [] wordArray = word.split ("");
        List <String> wordList= Arrays.asList(wordArray);

        List <String> wordBackwards = new ArrayList<>();

        for (int i = 0; i < wordList.size(); i++) {
            wordBackwards = wordBackwards.add(i, wordList.get(wordList.size()-i));
        }
        System.out.println(wordBackwards);
**/

    }
}
