public class Fibonacci {

    public int createFibo( int period) {
        if ( period == 1) {
            return 0;
        } else if (period == 2) {
            return 1;
        }
        return createFibo(period - 2) + createFibo(period - 1);
    }
}
