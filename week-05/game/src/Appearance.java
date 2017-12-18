import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Appearance extends PositionedImage {

  BufferedImage path;
  BufferedImage wall;
  char[][] boardMatrix = readBoard("Board");

  public char[][] readBoard(String fileName) {
    Path filePath = Paths.get("src/" + fileName);
    char[][] labirinthLayout = new char[10][10];
    try {

      List<String> lines = Files.readAllLines (filePath);
      for (int i = 0; i < lines.size(); i++) {
        for (int j = 0; j < lines.get(i).length(); j++) {
          labirinthLayout [i][j] = lines.get(i).charAt(j);
        }
      }

    } catch(Exception e) {
      System.out.println("Oh no");
    }
    return labirinthLayout;
  }

  public void drawBoard(Graphics graphics, char [][] boardMatrix){
    for (int i = 0; i < 10 ; i++) {
      for (int j = 0; j < 10; j++) {
        if (boardMatrix[i][j] == 'p') {
          PositionedImage floor = new PositionedImage("floor.png", j * 72, i * 72);
          floor.draw(graphics);
        } else {
          PositionedImage wall = new PositionedImage("wall.png", j * 72, i * 72);
          wall.draw(graphics);
        }
      }
    }
  }

/**  @Override
  public void draw(Graphics graphics) {
    super.draw(graphics);
    for (int i = 0; i < 10 ; i++) {
      for (int j = 0; j < 10; j++) {
        if ( boardMatrix [i][j] == 'p') {
          try {
            path = ImageIO.read(new File("src/floor.png"));
          } catch (Exception e) {
            e.printStackTrace();
          }
          graphics.drawImage(path, j * 72, i * 72, null);
        }  else {
          try {
            path = ImageIO.read(new File("src/wall.png"));
          } catch (Exception e) {
            e.printStackTrace();
          }
          graphics.drawImage(wall, j * 72, i * 72, null);
        }
      }
    }
  }**/
}
