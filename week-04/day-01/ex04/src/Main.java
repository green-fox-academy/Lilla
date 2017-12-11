import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        myDice.roll();

        //List<Integer> sixTimesSix = new ArrayList<>();
        for (int i = 0; i < myDice.dices.length; i++) {
                while (myDice.getCurrent(i) != 6) {
                    myDice.reroll(i);
                    System.out.println(Arrays.toString(myDice.dices));
                }
        }
        System.out.println(Arrays.toString(myDice.dices));
    }
}
