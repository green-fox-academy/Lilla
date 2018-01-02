import java.util.Collections;

public class FleetOfThings{

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    Thing todo1 = new Thing("Clean up kitchen");
    fleet.add(todo1);
    Thing todo2 = new Thing("Remove the obstacles");
    fleet.add(todo2);
    todo2.complete();
    Thing todo3 = new Thing("Buy milk");
    fleet.add(todo3);
    todo3.complete();
    Thing todo4 = new Thing("Eat brunch");
    todo4.complete();
    fleet.add(todo4);
    Thing todo5 = new Thing("Apply job");
    fleet.add(todo5);
    Thing todo6 = new Thing("Write essay");
    fleet.add(todo6);

    Collections.sort(fleet.getThings());
    System.out.println(fleet);
  }
}