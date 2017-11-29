public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";

        todoText = "My todo: \n" + todoText + " - Download games\n" + "   - Diablo";

        System.out.println(todoText);
    }
}
