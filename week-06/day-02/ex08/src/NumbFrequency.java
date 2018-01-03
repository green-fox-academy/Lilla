import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class NumbFrequency {

  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>
            (Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    Map<Integer, Long> numbFrequency = numbers.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

    numbFrequency.entrySet().stream()
            .forEach(System.out::println);
  }
}
