public class FindUppercase {

  public static void main(String[] args) {

    String upperLowerCase = "ItiSSOmeTHingWithALOTOFloWerANDuPPerCAse";

    upperLowerCase.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString((char)c))
            .forEach(System.out::print);
  }
}
