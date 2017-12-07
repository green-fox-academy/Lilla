public class blablaBubble {

    public static void main(String[] args) {
        System.out.println(changeXtoY("xyxuxcxaxtxaxnx"));
    }

    private static String changeXtoY(String change) {
        if (!change.contains("x")) {
            return change;
        } else {
            return changeXtoY(change.replace("x", ""));
        }
    }
}
