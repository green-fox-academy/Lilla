public class BunniesAgain {
    public static void main(String[] args) {
        System.out.println(bunniesEars(4));
    }

    private static int bunniesEars(int lineNumber) {
        if (lineNumber > 0) {
           if (lineNumber % 2 == 0) {
               return 3 + bunniesEars(lineNumber - 1);
           } else {
               return 2 + bunniesEars(lineNumber - 1);
           }
        }
        return lineNumber;
    }
}
