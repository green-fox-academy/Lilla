import java.util.*;

public class QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        // What I cannot create, I do not understand
        list.add(2,list.get(5));
        list.add(5,list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
