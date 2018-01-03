public class Gnirts implements CharSequence {

  String something;
  public Gnirts(String something) {
    this.something = something;
  }

  @Override
  public int length() {
    return something.length();
  }

  @Override
  public char charAt(int index) {
    return something.charAt(something.length() - index - 1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
