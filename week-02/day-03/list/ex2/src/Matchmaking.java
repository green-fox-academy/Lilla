import java.util.*;

public class Matchmaking {
    public static void main(String[] args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
        ArrayList<String> order = new ArrayList<String>();

        for ( int i = 0; i < girls.size(); i++) {
        order.add( girls.get(i) + ", " + boys.get(i) );}

        System.out.println(order);


    }
}
