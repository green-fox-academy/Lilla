import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        int [] aj = {3, 4, 5, 6, 7};
        int [] ajreverse = new int[5];
        for (int i = 0; i < aj.length; i++) {
             ajreverse [i] = aj [aj.length - i - 1];
        }
        System.out.println(Arrays.toString(ajreverse));
    }
}
