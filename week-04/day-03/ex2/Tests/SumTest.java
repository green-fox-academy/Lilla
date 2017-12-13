import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {
    /** @Test
    public void sum() throws Exception {
        Sum testList = new Sum();
        Integer [] array = {1,2,3,4};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        assertEquals(10, testList.sum(list));
    }

    @Test
    public void sum() throws Exception {
        Sum testList = new Sum();
        Integer [] array = {1};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        assertEquals(1, testList.sum(list));
    }

    @Test
    public void sum() throws Exception {
        Sum testList = new Sum();
        Integer [] array = {};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        assertEquals(0, testList.sum(list));
    }**/

    @Test
    public void sum() throws Exception {
        Sum testList = new Sum();
        Integer [] array = null;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        assertEquals(null, testList.sum(list));
    }
}