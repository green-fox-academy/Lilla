public class Shifter implements CharSequence {

  protected String example;
  protected int shifted;

  public Shifter(String example, int shifted) {
    this.example = example;
    this.shifted = shifted;
  }

  @Override
  public int length() {
    return example.length();
  }

  @Override
  public char charAt(int index) {
    return example.charAt(index + shifted);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
