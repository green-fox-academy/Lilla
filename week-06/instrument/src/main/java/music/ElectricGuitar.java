package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  @Override
  public void sound() {
    System.out.println("Twang");
  }

  public ElectricGuitar() {
    super(6);
  }

  public ElectricGuitar(int numberOfStrings) {
    super(numberOfStrings);
  }

  @Override
  public void play() {
  sound();
  }
}
