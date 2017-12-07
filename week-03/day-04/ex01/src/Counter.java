public class Counter {
    public static void main(String[] args) {
        System.out.println(countDown(4));
    }

    public static int countDown(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n);
            return countDown(n - 1);
        }
    }
}
