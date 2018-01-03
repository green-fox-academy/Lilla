import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharFrequency {

  public static void main(String[] args) {

    String simpleWord = "gyalogkakukk";

    List<String> charList = simpleWord.chars()
            .mapToObj(c -> Character.toString((char)c))
            .collect(Collectors.toList());

    Map<Object, Long> charFrequency = charList.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    charFrequency.entrySet().stream()
            .forEach(entry -> System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue()));
  }
}
