import java.util.ArrayList;

import java.util.List;

public class Sum {

    //int[] array = {1,2,3,4};
    //List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));

    //List<Integer> list = new ArrayList<>();

    public int sum (ArrayList<Integer> input){
        int summation = 0;
        for (int i = 0; i < input.size()  ; i++) {
            summation = summation+ input.get(i);
        }
        return summation;
    }
}
