import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    ArrayList <Fox> pack = new ArrayList<>();

    pack.add( new Fox("indiai róka ","bengalensis", "green" ));
    pack.add( new Fox("afgán róka ","cana", "grey" ));
    pack.add( new Fox("fakó róka "," pallida", "orange" ));
    pack.add( new Fox("vörös róka ","vulpes", "red" ));
    pack.add( new Fox("sivatagi róka ","zerda", "yellow" ));
    pack.add( new Fox("pusztai róka ","corsac", "green" ));


    pack.stream()
            .filter(currentFox -> currentFox.getColor().equals("green"))
            .forEach(f -> System.out.println(f.getName()));

    pack.stream()
            .filter(currentFox -> currentFox.getColor().equals("green")
                    && currentFox.getType().equals("corsac"))
            .forEach(f -> System.out.println(f.getName()));
  }
}
