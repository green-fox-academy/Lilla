import java.awt.image.BufferedImage;

public class GameObject {
  String imagePath;

  public GameObject(String imagePath) {
    this.imagePath = imagePath;
  }

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }
}
