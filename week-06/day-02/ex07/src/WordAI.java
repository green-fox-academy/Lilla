import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordAI {
  public static void main(String[] args) {

    ArrayList<String> cities = new ArrayList<>
            (Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
                    "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    String starter = "A";
    String closer = "I";

    List<String> citiesWithAI = cities.stream()
            .filter(n -> n.startsWith(starter) && n.endsWith(closer))
            .collect(Collectors.toList());

    System.out.println(citiesWithAI);
  }
}
