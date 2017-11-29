import java.util.*;

public class AppendLetter {
    public static void main(String[] args) {
        ArrayList<String> far = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk"));

        for ( int i = 0; i < far.size(); i++) {
           far.set(i,  far.get(i) + "a");

            //String animal =  far.get(i) + "a";
            //System.out.println(animal);
        }
        System.out.println(far);

    }
}
