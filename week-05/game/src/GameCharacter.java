public class GameCharacter extends GameObject {

  private int maxHealthpPoint;
  private int currentHealthPoint;
  private int defendPoint;
  private int strikePoint;
  private boolean isAlive;

  public GameCharacter(String imagePath) {
    super(imagePath);
  }

  public GameCharacter() {
  }

  public int[] FindCurrentLocation(GameObject[][] matrix) {
    int[] currentLocation = new int[2];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i][j] instanceof Hero) {
          currentLocation[0] = i;
          currentLocation[1] = j;
        }
      }
    }
    return currentLocation;
  }

  public GameObject[][] moveHeroRight(GameObject[][] matrix){
    int[] currentLocation;
    GameCharacter gameElement = new GameCharacter();
    currentLocation = gameElement.FindCurrentLocation(matrix);
    if(currentLocation[1] != matrix[0].length -1) {
      TilePath floor = new TilePath();
      matrix[currentLocation[0]][currentLocation[1]] = floor;
      Hero hero = new Hero();
      hero.moveHeroRight();
      matrix[currentLocation[0]][currentLocation[1] + 1] = hero;
    }
    return matrix;
  }

  public GameObject[][] moveHeroLeft(GameObject[][] matrix){
    int[] currentLocation;
    GameCharacter gameElement = new GameCharacter();
    currentLocation = gameElement.FindCurrentLocation(matrix);
    if(currentLocation[1] != 0) {
      TilePath floor = new TilePath();
      matrix[currentLocation[0]][currentLocation[1]] = floor;
      Hero hero = new Hero();
      hero.moveHeroLeft();
      matrix[currentLocation[0]][currentLocation[1] - 1] = hero;
    }
    return matrix;
  }

  public GameObject[][] moveHeroUp(GameObject[][] matrix){
    int[] currentLocation;
    GameCharacter gameElement = new GameCharacter();
    currentLocation = gameElement.FindCurrentLocation(matrix);
    if(currentLocation[0] != matrix[0].length - 1) {
      TilePath floor = new TilePath();
      matrix[currentLocation[0]][currentLocation[1]] = floor;
      Hero hero = new Hero();
      hero.moveHeroUp();
      matrix[currentLocation[0] + 1 ][currentLocation[1]] = hero;
    }
    return matrix;
  }

  public GameObject[][] moveHeroDown(GameObject[][] matrix){
    int[] currentLocation;
    GameCharacter gameElement = new GameCharacter();
    currentLocation = gameElement.FindCurrentLocation(matrix);
    if(currentLocation[1] != 0) {
      TilePath floor = new TilePath();
      matrix[currentLocation[0]][currentLocation[1]] = floor;
      Hero hero = new Hero();
      hero.moveHeroDown();
      matrix[currentLocation[0] - 1][currentLocation[1] - 1] = hero;
    }
    return matrix;
  }
}
