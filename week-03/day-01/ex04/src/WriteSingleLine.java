import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("my-file.txt");
            List <String> line = Files.readAllLines(filePath);
            line.add("Lilla");
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
