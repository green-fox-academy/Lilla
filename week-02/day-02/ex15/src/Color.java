import java.util.Arrays;

public class Color {
    public static void main(String[] args) {
        String [][] myArray = new String[3][5];

        String[]  colors0 = {"lime", "forest green", "olive", "pale green", "spring green"};
        String[]  colors1 = { "orange red", "red", "tomato" , "" , ""};
        String[]  colors2 = {"orchid", "violet", "pink", "hot pink", ""};
        for (int j = 0; j < 5; j++) {
                myArray [0] [j] = colors0[j];
                myArray [1] [j] = colors1[j];
                myArray [2] [j] = colors2[j];
        }
        System.out.println(Arrays.deepToString(myArray).replace("], ", "]\n"));
    }
}
