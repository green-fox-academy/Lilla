public class DrawChessTable {
    public static void main(String[] args) {
        int number = 8;
        for (int i = 0; i < number; i++) {
            for (int j = i + 1; j < number + i + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("%");
                }
            }
            System.out.println("");
        }
    }
}
