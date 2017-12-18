import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Appearance extends PositionedImage {

  GameObject[][] boardMatrix = readBoard("Board");

  public GameObject[][] readBoard(String fileName) {
    Path filePath = Paths.get("src/" + fileName);
    GameObject[][] labirinthLayout = new GameObject[10][10];
    try {
      List<String> lines = Files.readAllLines (filePath);
      for (int i = 0; i < lines.size(); i++) {
        for (int j = 0; j < lines.get(i).length(); j++) {
          if (lines.get(i).charAt(j) == 'p') {
            TilePath path = new TilePath();
            labirinthLayout [i][j] = path;
          } else if (lines.get(i).charAt(j) == 'w') {
            TileWall wall = new TileWall();
            labirinthLayout [i][j] = wall;
          } else if (lines.get(i).charAt(j) == 'h') {
            Hero hero = new Hero();
            labirinthLayout [i][j] = hero;
          }
        }
      }
    } catch(Exception e) {
      System.out.println("Oh no");
    }
    return labirinthLayout;
  }

  public void drawBoard(Graphics graphics, GameObject [][] boardMatrix){
    for (int i = 0; i < 10 ; i++) {
      for (int j = 0; j < 10; j++) {
        PositionedImage tile = new PositionedImage(boardMatrix[i][j].imagePath, j * 72, i * 72);
        tile.draw(graphics);
      }
    }
  }
}
