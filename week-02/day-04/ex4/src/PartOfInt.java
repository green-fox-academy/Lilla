import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartOfInt {
    public static void main(String[] args) {
        System.out.println("Please enter some number and as you finished type your name: ");
        Scanner scannerList = new Scanner(System.in);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        while (scannerList.hasNextInt()) {
            listOfNumbers.add(scannerList.nextInt());
        }
        System.out.println(listOfNumbers);

        System.out.println("Please enter a number: ");
        Scanner scannerNumber = new Scanner(System.in);
        int number = scannerNumber.nextInt();

        List<Integer> withNumber = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) == number) {
                withNumber.add(listOfNumbers.indexOf(number));
            }
        }
        System.out.println(withNumber);
    }
}
