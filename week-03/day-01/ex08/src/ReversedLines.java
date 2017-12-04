import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        Path path = Paths.get("rev.txt");
        Path path2 = Paths.get("new.txt");
        //FileWriter writeMyFile = new FileWriter("new.txt");

        List<String> originalList = new ArrayList<>();
        String revList = "";

        try {
            List <String> listOflines = Files.readAllLines(path);
            for (int i = 0; i < listOflines.size(); i++) {
                for (int j = 0; j < (listOflines.get(i).length()); j ++) {
                    System.out.print(listOflines.get(i).charAt(listOflines.get(i).length() - j -1));
                    //decrypted = decrypted + listOflines.get(i).charAt(j);
                }
                System.out.println();
                //decryptedList.add(decrypted);
            }
            //FileWriter(path2, decryptedList);
        } catch (Exception e){
            System.out.println("Error");
        }
    }
}
