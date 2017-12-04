import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your file's name: ");
        Path pathExistingFile = Paths.get(scan.nextLine());

        System.out.println("Enter your new file's name: ");
        Path pathNewFile = Paths.get(scan.nextLine());

        try {
            List<String> existingFileLines = Files.readAllLines(pathExistingFile);

            List<String> newFileLines = Files.readAllLines(pathNewFile);
            newFileLines.addAll(existingFileLines);

            Files.write(pathNewFile, newFileLines);
            System.out.println("Copy was successful!");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}

