import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Unique {
    public static void main(String[] args) {
        System.out.println("Please enter a bunch of number and as you finished type your name and hit enter: ");
        Scanner scanner = new Scanner(System.in);

        ArrayList <Integer> inputs = new ArrayList<>();
        while (scanner.hasNextInt()) {
            inputs.add(scanner.nextInt());
        }
        List<Integer> unique = inputs.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);
    }
}
