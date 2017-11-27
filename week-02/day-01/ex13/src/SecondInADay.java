public class SecondInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        System.out.println( (24*60*60)-(currentHours*currentMinutes*currentSeconds)-(currentMinutes*currentSeconds)-currentSeconds);
    }
}
