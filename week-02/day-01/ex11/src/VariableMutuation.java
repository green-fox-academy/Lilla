import javax.sound.midi.Soundbank;

public class VariableMutuation {
    public static void main(String[] args) {
        int a = 3;
        a = a + 10;
        System.out.println( a );

        int b = 100;
        b = b - 7;
        System.out.println( b );

        int c = 44;
        c = c * 2;
        System.out.println( c );

        int d = 125;
        d = d / 5;
        System.out.println( d );

        int e = 8;
        System.out.println( Math.pow( e, 3)); // why not int??

        int f1 = 123;
        int f2 = 345;
        if (f1 > f2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int g1 = 350;
        int g2 = 200;
        if ( g2 * 2 > g1 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int h = 135798745;
        if ( h % 11 == 0 ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int i1 = 10;
        int i2 = 3;
        if ( (i1 > i2 * i2) && (i1 < i2 * i2 * i2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int j = 1521;
        if ( j % 3 == 0 || j % 5 == 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        String k = " Apple";
        int k1 = 0;

        while ( k1 < 4) {
            System.out.println(k);
            k1 = k1 + 1;
        }



    }
}
