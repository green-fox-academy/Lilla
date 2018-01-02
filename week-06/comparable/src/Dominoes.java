import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dominoes {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    List<Domino> dominosOrder = new ArrayList<>();
    dominosOrder.add(dominoes.get(0));
    for (int i = 0; i < dominoes.size(); i++) {
      for (int j = 0; j < dominoes.size(); j++) {
        if (dominosOrder.get(i).getValues()[1] == dominoes.get(j).getValues()[0]) {
          dominosOrder.add(dominoes.get(j));
        }
      }
    }
    System.out.println(dominosOrder);
    Collections.sort(dominoes);
    System.out.println(dominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    //System.out.println(dominoes.get(0).toString());
    return dominoes;
  }
}

