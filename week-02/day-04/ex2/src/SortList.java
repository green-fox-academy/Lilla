import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortList {
    public static void main(String[] args) {

        System.out.println("Please enter a bunch of number and as you finished type your name and hit enter: ");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> inputs = new ArrayList<>();
        while (scanner.hasNextInt()) {
            inputs.add(scanner.nextInt());
        }
        Collections.sort(inputs);
        System.out.println(inputs);
        Collections.reverse(inputs);
        System.out.println(inputs);
    }
}
