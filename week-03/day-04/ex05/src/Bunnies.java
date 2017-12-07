
public class Bunnies {
    public static void main(String[] args) {
        System.out.println(earsCounter(4));
    }

    private static int earsCounter(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + earsCounter(bunnies - 1);
        }
    }
}
