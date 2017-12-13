import java.util.Arrays;
import java.util.List;

public class Anagram {
    public boolean isAnagram (String word1, String word2) {
        String [] word1Array = word1.split ("");
        List<String> word1List= Arrays.asList(word1Array);

        String [] word2Array = word2.split ("");
        List <String> word2List= Arrays.asList(word2Array);

        if (word1List.containsAll(word2List)) {
            return true;
        } else {
            return  false;
        }
    }
}
