public class Hero extends GameCharacter {

  public Hero() {
    super("hero-down.png");
  }

  public void moveHeroRight(){
    setImagePath("hero-right.png");
  }

  public void moveHeroLeft(){
    setImagePath("hero-left.png");
  }

  public void moveHeroUp(){
    setImagePath("hero-up.png");
  }

  public void moveHeroDown(){
    setImagePath("hero-down.png");
  }
}
