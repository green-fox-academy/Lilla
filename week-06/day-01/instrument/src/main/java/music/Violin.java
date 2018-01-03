package main.java.music;

public class Violin extends StringedInstrument {

  @Override
  public void sound() {
    System.out.println("Screech");
  }

  public Violin() {
    super(4);
  }

  public Violin(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public void play() {
    sound();
  }
}
