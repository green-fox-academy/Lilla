public class factorial {
    public static void main(String[] args) {

        long result = factorio(10);
        System.out.println(result);
    }

    public static int factorio(int number) {

        if (number <= 1)
            return 1;
        else
            return  number * factorio(number-1);
    }
}
