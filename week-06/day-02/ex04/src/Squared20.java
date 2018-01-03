import java.util.ArrayList;
import java.util.Arrays;

public class Squared20 {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>
            (Arrays.asList(3, 9, 2, 8, 6, 5));

    numbers.stream()
            .map(n -> Math.pow(n, 2))
            .filter(n -> n > 20)
            .forEach(System.out::println);
  }
}
