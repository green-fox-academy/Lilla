import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
    @Test
    public void makeDictionary() throws Exception {
        CountLetters example = new CountLetters();
        String word = "gyopár";
        assertEquals(word.length() - 1, example.makeDictionary(word).get('r') );
    }

}