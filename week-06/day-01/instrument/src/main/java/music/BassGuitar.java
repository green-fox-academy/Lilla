package main.java.music;

public class BassGuitar extends StringedInstrument {

  @Override
  public void sound() {
    System.out.println("Duum-duum-duum");
  }

  public BassGuitar() {
    super(4);
  }

  public BassGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public void play() {
    sound();
  }
}
