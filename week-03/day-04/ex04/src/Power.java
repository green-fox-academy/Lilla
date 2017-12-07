public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }

    private static int power(int base, int powerN) {
        if (powerN == 0) {
            return 1;
        } else {
            return base * power(base, powerN - 1);
        }
    }
}
