import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    @Test
    public void getApple() throws Exception {
        Apple jonathan = new Apple();
        //assertEquals("apple", jonathan.getApple());
        assertEquals("pear", jonathan.getApple());
    }

}