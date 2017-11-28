import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println(" Please give the numbers of the girls and boy, who coming to the party: ");
        Scanner inputGirls = new Scanner(System.in);
        int numberOfGirls = inputGirls.nextInt();
        Scanner inputBoys = new Scanner(System.in);
        int numberOfBoys = inputBoys.nextInt();

        if ( numberOfBoys == numberOfGirls && numberOfBoys + numberOfGirls > 20) {
            System.out.println("The party is excellent");
        } else if (numberOfBoys != numberOfGirls && numberOfBoys + numberOfGirls > 20 && numberOfGirls != 0) {
            System.out.println("Quite good party!");
        } else if ( numberOfGirls + numberOfBoys <= 20) {
            System.out.println("Average party...");
        } else if (numberOfGirls == 0) {
            System.out.println("Sausage party");
        }


    }
}
