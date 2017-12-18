import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PositionedImage {

  BufferedImage image;
  int posX, posY;


  public void readBoard(String fileName) {
    Path filePath = Paths.get("src/" + fileName);
    try {
      int[][] labirinthLayout = new int[10][10];
      List<String> lines = Files.readAllLines (filePath);
      for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
          labirinthLayout [i][j] = lines.get(i).charAt(j);
        }
      }

    } catch(Exception e) {
      System.out.println("Oh no");
    }

  }

  public PositionedImage() {
  }

  public PositionedImage(String filename, int posX, int posY) {
    this.posX = posX;
    this.posY = posY;
    try {
      image = ImageIO.read(new File(filename));
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public void draw(Graphics graphics) {
    if (image != null) {
      graphics.drawImage(image, posX, posY, null);
    }
  }
}
