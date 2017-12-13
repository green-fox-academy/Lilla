import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    /**@Test
    public void checkAnagram() throws Exception {
        Anagram anagram1 = new Anagram();
        String input1 = "kerék";
        String input2 = "kérek";
        assertTrue(anagram1.isAnagram(input1, input2));
    }**/
    @Test
    public void checkAnagram() throws Exception {
        Anagram anagram1 = new Anagram();
        String input1 = "kerék";
        String input2 = "felhő";
        assertTrue(anagram1.isAnagram(input1, input2));
    }
}