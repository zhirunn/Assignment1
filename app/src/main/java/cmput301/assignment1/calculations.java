package cmput301.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by JustinWong on 15-10-03.
 */
public class calculations {

    //calculations are bugged but I can't seem to find the error
    //if you find out how to fix the bug, please tell me

    public String minValue(ArrayList<String> aList) {
        int min = Integer.parseInt(aList.get(0));
        //int minIndex = 0;
        for (int s = 1; s < aList.size(); s++){
            int currentInt = Integer.parseInt(aList.get(s));
            if (currentInt < min) {
                min = currentInt;
                //minIndex = s;
            }
        }
        return Integer.toString(min);
    }

    public String maxValue(ArrayList<String> aList) {
        int max = Integer.parseInt(aList.get(0));
        //int maxIndex = 0;
        for (int s = 1; s < aList.size(); s++){
            int currentInt = Integer.parseInt(aList.get(s));
            if (currentInt > max) {
                max = currentInt;
                //maxIndex = s;
            }
        }
        return Integer.toString(max);
    }


    public void averageValue() {
    }

    public void medianValue() {
    }
}
