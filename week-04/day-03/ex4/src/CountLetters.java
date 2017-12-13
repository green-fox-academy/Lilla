import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public Map makeDictionary(String word){
        Map<Character, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            dictionary.put(word.charAt(i), i);
        }
        System.out.println(dictionary);
        return dictionary;
    }

}
