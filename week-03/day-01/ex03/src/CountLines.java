import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        Path filePath = Paths.get("my-newfile.txt");
        File f = new File("my-newfile.txt");
        List<String> lines = null;
        String fileName = f.getAbsoluteFile().toString();
        try {
            lines = Files.readAllLines(filePath);
            System.out.println(lines.size());
        } catch(Exception e) {
            System.out.println("0");
        }
    }
}
