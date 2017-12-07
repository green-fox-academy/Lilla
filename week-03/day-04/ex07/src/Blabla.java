public class Blabla {

    public static void main(String[] args) {
        System.out.println(changeXtoY("xucatan xerxes"));
    }

    private static String changeXtoY(String change) {
        if (!change.contains("x")) {
            return change;
        } else {
            return changeXtoY(change.replace("x", "y"));
            //the replace should be inside of the return!!
        }
    }
}
