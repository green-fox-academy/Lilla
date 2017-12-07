public class NumberAdd {
    public static void main(String[] args) {
        System.out.println(add(3));
    }

    private static int add(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + add( n - 1 );
        }
    }
}
