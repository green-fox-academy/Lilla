import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Appearance extends PositionedImage {

  private GameObject[][] boardMatrix = readFile("Board");
  private GameObject[][] characterMatrix = readFile("CharacterPositionBoard");

  public GameObject[][] getBoardMatrix() {
    return boardMatrix;
  }

  public GameObject[][] getCharacterMatrix() {
    return characterMatrix;
  }

  public GameObject[][] readFile(String fileName) {
    Path filePath = Paths.get("src/" + fileName);
    GameObject[][] coordinateList = new GameObject[10][10];
    try {
      List<String> lines = Files.readAllLines (filePath);
      for (int i = 0; i < lines.size(); i++) {
        for (int j = 0; j < lines.get(i).length(); j++) {
          if (lines.get(i).charAt(j) == 'p') {
            TilePath path = new TilePath();
            coordinateList [i][j] = path;
          } else if (lines.get(i).charAt(j) == 'w') {
            TileWall wall = new TileWall();
            coordinateList [i][j] = wall;
          } else if (lines.get(i).charAt(j) == 'h') {
            Hero hero = new Hero();
            coordinateList[i][j] = hero;
          } else if (lines.get(i).charAt(j) == 'b') {
            Boss boss = new Boss();
            coordinateList[i][j] = boss;
          } else if (lines.get(i).charAt(j) == 'm') {
            Monster skeleton = new Monster();
            coordinateList[i][j] = skeleton;
          } else {
            System.out.println("null");
          }
        }
      }
    } catch(Exception e) {
      System.out.println("Oh no");
    }
    return coordinateList;
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
