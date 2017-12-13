import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {
    @Test
    public void makeDictionary() throws Exception {
        CountLetters example = new CountLetters();
        String word = "gyalogkakukk";
        assertEquals(4, example.makeDictionary(word).get('k') );
    }

}