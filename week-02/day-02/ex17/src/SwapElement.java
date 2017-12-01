import java.util.Arrays;

public class SwapElement {
    public static void main(String[] args) {
        String [] abc = {"first", "second", "third"};

        for (int i = 0; i < abc.length ; i++) {
            abc[i] = abc [abc.length - i -1];
        }
        System.out.println(Arrays.toString(abc));
    }
}
