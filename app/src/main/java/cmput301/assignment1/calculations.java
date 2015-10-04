package cmput301.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by JustinWong on 15-10-03.
 */
public class calculations {

    public void convertToInt(ArrayList<String> aList) {
        ArrayList<Integer> RItimes = new ArrayList<Integer>(aList.size()) ;
        for(String number : aList) {
            RItimes.add(Integer.parseInt(number));
        }
    }

    public void minValue(ArrayList<String> aListi) {
        convertToInt(aListi);
        Collections.min(aListi);
    }

    public void maxValue(ArrayList<String> aListi) {
        convertToInt(aListi);
        Collections.max(aListi);
    }

    public void averageValue() {
    }

    public void medianValue() {
    }
}
