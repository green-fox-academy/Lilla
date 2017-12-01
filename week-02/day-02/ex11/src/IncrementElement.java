import java.util.Arrays;

public class IncrementElement {
    public static void main(String[] args) {
        int [] t = {1, 2, 3, 4, 5};
        t[2] = t[2] + 3;
        System.out.println(Arrays.toString(t));
    }
}
