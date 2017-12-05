import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DuplicatedChars {
    public static void main(String[] args) {
        Path path = Paths.get("dup.txt");
        Path path2 = Paths.get("dcrypt.txt");

        List<String> decryptedList = new ArrayList<>();
        String decrypted = "";

        try {
            List <String> listOflines = Files.readAllLines(path);
            for (int i = 0; i < listOflines.size(); i++) {
                for (int j = 0; j < (listOflines.get(i).length()); j += 2) {
                    System.out.print(listOflines.get(i).charAt(j));
                    decrypted = decrypted + listOflines.get(i).charAt(j);
                }
                System.out.println();
            }
            decryptedList.add(decrypted);
            Files.write(path2, decryptedList);
        } catch (Exception e){
                System.out.println("Error");
        }
    }
}
