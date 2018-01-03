import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharToString {

  public static void main(String[] args) {


    char [] charArray = {'a','b','c','d','e','f','g','h','i', 'j','k','l','m','n','o','p',
                    'q','r','s','t','u','v','w','x','y','z'};

    Stream<String> charStream =  new String(charArray).chars()
            .mapToObj(c -> String.valueOf((char) c));

    String stringOfChars = charStream.collect(Collectors.joining());

    System.out.println(stringOfChars);
  }
}
