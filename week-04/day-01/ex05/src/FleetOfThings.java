public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing toDo1 = new Thing("Get milk");
        fleet.add(toDo1);

        Thing toDo2 = new Thing("Remove the obstacles");
        fleet.add(toDo2);

        Thing toDo3 = new Thing("Stand up");
        toDo3.complete();
        fleet.add(toDo3);


        Thing toDo4 = new Thing("Eat lunch");
        toDo4.complete();
        fleet.add(toDo4);

        System.out.println(fleet);
    }
}
