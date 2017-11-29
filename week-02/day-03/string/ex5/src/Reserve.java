public class Reserve {
    public static void main(String[] args) {

        String reversed = exchange(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI");
        //System.out.print(exchange(reversed));

    }
    public static String exchange(String word){
        for (int i = 0; i < (word.length() ); i++) {
            String normalOrder = "" + word.charAt(word.length() - 1  - i);
           System.out.print(normalOrder);
        } return word;
    }

}
