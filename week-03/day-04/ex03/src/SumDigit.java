public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sumDig(1));    }

    private static int sumDig(int n) {
        if ( n == 0) {
            return 0;
        } else {
            return n % 10 + sumDig(n / 10);
        }
    }
}
