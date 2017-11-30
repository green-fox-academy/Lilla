public class ConditionalVariableMutation {
    public static void main(String[] args) {
        int b = 13;
        if (b < 10) {
            String out2 = "More";
            System.out.println(out2);
        } else if (b > 20) {
            String out2 = "Less";
            System.out.println(out2);
        } else {
            String out2 = "Sweet";
            System.out.println(out2);
        }


        int c = 123;
        int credits = 50;
        boolean isBonus = true;
        if ( credits >= 50 && isBonus == false) {
            System.out.println(c - 2);
        } else if ( credits > 50) {
            System.out.println(c - 1);
        } else {
            System.out.println(c);
        }


        int d = 8;
        int time = 120;
        if ( d % 4 == 0 && time <= 200) {
            String out3 = "check";
            System.out.println(out3);
        } else if ( time > 200 ) {
            String out3 = "Time out!";
            System.out.println(out3);
        } else {
            String out3 = "Run Forest Run!";
            System.out.println(out3);
        }

    }

}
