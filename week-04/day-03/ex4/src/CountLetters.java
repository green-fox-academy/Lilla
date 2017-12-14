import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public Map makeDictionary(String word){
        Map<Character, Integer> dictionary = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            Integer freqency = dictionary.get(x);
            dictionary.put(word.charAt(i), i);
            if (freqency != null) {
                dictionary.put(x, new Integer (freqency + 1));
            } else {
                dictionary.put(x,1);
            }
        }
        System.out.println(dictionary);
        return dictionary;
    }
}
