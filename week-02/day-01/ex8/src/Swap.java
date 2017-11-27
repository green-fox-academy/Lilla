public class Swap {
    public static void main(String[] args) {
        int a = 123 ;
        int b = 526 ;
        a = a ^ b;

        System.out.println( b = b ^ a );
        System.out.println( a = a ^ b );
    }
}
