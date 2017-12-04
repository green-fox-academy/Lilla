import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Write the name of your file: ");
        Path path = Paths.get(input.nextLine());

        System.out.println("Write a word: ");
        String word = input.next();

        System.out.println("Write a number: ");
        int number = input.nextInt();

        try {
            for (int i = 0; i < number; i++) {
                list.add(word);
                Files.write(path, list);
            }
        } catch (Exception e) {
            System.out.println("");
        }
    }
}
