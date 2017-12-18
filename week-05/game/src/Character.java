public class Character extends GameObject {

  private int maxHealthpPoint;
  private int currentHealthPoint;
  private int defendPoint;
  private int strikePoint;
  private boolean isAlive;
  private int [][] position;


  public Character(String imagePath) {
    super(imagePath);
  }

  public void move() {
    //todo wall next to it or not
  }

}
