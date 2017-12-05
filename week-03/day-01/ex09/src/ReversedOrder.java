import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        Path path = Paths.get("list.txt");
        Path path2 = Paths.get("new.txt");
        
        try {
            List <String> revOrderList = Files.readAllLines(path);
            List <String> nomralOrderList = new ArrayList<>();

        for (int i = 0; i < revOrderList.size(); i++) {
            nomralOrderList.add(revOrderList.get(revOrderList.size() - i -1));
        }
        Files.write(path2, nomralOrderList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
