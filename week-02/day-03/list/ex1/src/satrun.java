import java.util.*;

public class satrun {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
        planetList.add(5, "Saturn");
        System.out.println(planetList);
    }
}
