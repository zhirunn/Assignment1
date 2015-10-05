/**
 Copyright 2015 Justin Wong

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

 */

package cmput301.assignment1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by JustinWong on 15-10-03.
 */
public class calculations {

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

    public String min10Value(ArrayList<String> aList) {
        if (aList.size() >= 10) {
            ArrayList<String> aList10 = new ArrayList<String>();
            for (int c = 1; c <= 10; c++) {
                aList10.add(aList.get(aList.size() - c));
            }
            int min = Integer.parseInt(aList10.get(0));
            for (int s = 1; s < aList10.size(); s++) {
                int currentInt = Integer.parseInt(aList10.get(s));
                if (currentInt < min) {
                    min = currentInt;
                }
            }
            return Integer.toString(min);
        }
        else {
            return "null";
        }
    }

    public String min100Value(ArrayList<String> aList) {
        if (aList.size() >= 100) {
            ArrayList<String> aList100 = new ArrayList<String>();
            for (int c = 1; c <= 100; c++) {
                aList100.add(aList.get(aList.size() - c));
            }
            int min = Integer.parseInt(aList100.get(0));
            for (int s = 1; s < aList100.size(); s++) {
                int currentInt = Integer.parseInt(aList100.get(s));
                if (currentInt < min) {
                    min = currentInt;
                }
            }
            return Integer.toString(min);
        }
        else {
            return "null";
        }
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

    public String max10Value(ArrayList<String> aList) {
        if (aList.size() >= 10) {
            ArrayList<String> aList10 = new ArrayList<String>();
            for (int c = 1; c <= 10; c++) {
                aList10.add(aList.get(aList.size() - c));
            }
            int max = Integer.parseInt(aList10.get(0));
            for (int s = 1; s < aList10.size(); s++) {
                int currentInt = Integer.parseInt(aList10.get(s));
                if (currentInt > max) {
                    max = currentInt;
                }
            }
            return Integer.toString(max);
        }
        else {
            return "null";
        }
    }

    public String max100Value(ArrayList<String> aList) {
        if (aList.size() >= 100) {
            ArrayList<String> aList100 = new ArrayList<String>();
            for (int c = 1; c <= 100; c++) {
                aList100.add(aList.get(aList.size() - c));
            }
            int max = Integer.parseInt(aList100.get(0));
            for (int s = 1; s < aList100.size(); s++) {
                int currentInt = Integer.parseInt(aList100.get(s));
                if (currentInt > max) {
                    max = currentInt;
                }
            }
            return Integer.toString(max);
        }
        else {
            return "null";
        }
    }

    public String averageValue(ArrayList<String> aList) {
        int sum = Integer.parseInt(aList.get(0));

        for (int s = 1; s < aList.size(); s++){
            int currentInt = Integer.parseInt(aList.get(s));
                sum = currentInt + sum;
            }
        return Integer.toString(sum/aList.size());
    }

    public String average10Value(ArrayList<String> aList) {
        if (aList.size() >= 10) {
            ArrayList<String> aList10 = new ArrayList<String>();
            for (int c = 1; c <= 10; c++) {
                aList10.add(aList.get(aList.size() - c));
            }
            int sum = Integer.parseInt(aList10.get(0));
            for (int s = 1; s < aList.size(); s++) {
                int currentInt = Integer.parseInt(aList.get(s));
                sum = currentInt + sum;
            }
            return Integer.toString(sum / aList.size());
        }
        else {
            return "null";
        }
    }

    public String average100Value(ArrayList<String> aList) {
        if (aList.size() >= 100) {
            ArrayList<String> aList100 = new ArrayList<String>();
            for (int c = 1; c <= 100; c++) {
                aList100.add(aList.get(aList.size() - c));
            }
            int sum = Integer.parseInt(aList100.get(0));
            for (int s = 1; s < aList.size(); s++) {
                int currentInt = Integer.parseInt(aList.get(s));
                sum = currentInt + sum;
            }
            return Integer.toString(sum / aList.size());
        }
        else {
            return "null";
        }
    }

    public String medianValue(ArrayList<String> aList) {

        //might be bugged
        ArrayList<Integer> aListInt = new ArrayList<Integer>();
        for(String number : aList) {
            aListInt.add(Integer.parseInt(number));
        }
        Collections.sort(aListInt);
        return Integer.toString(aListInt.get(aListInt.size() / 2));

        //return Integer.toString(Integer.parseInt(aList.get(aList.size() / 2)));

    }

    public String median10Value(ArrayList<String> aList) {
        if (aList.size() >= 10) {
            //might be bugged
            ArrayList<Integer> aListInt = new ArrayList<Integer>();
            for (String number : aList) {
                aListInt.add(Integer.parseInt(number));
            }
            ArrayList<Integer> aList10 = new ArrayList<Integer>();
            for (int c = 1; c <= 10; c++) {
                aList10.add(aListInt.get(aListInt.size() - c));
            }
            Collections.sort(aList10);
            return Integer.toString(aList10.get(aList10.size() / 2));
            //return Integer.toString(Integer.parseInt(aList.get(aList.size() / 2)));
        }
        else {
            return "null";
        }
    }

    public String median100Value(ArrayList<String> aList) {
        if (aList.size() >= 100) {
            //might be bugged
            ArrayList<Integer> aListInt = new ArrayList<Integer>();
            for (String number : aList) {
                aListInt.add(Integer.parseInt(number));
            }
            ArrayList<Integer> aList100 = new ArrayList<Integer>();
            for (int c = 1; c <= 100; c++) {
                aList100.add(aListInt.get(aListInt.size() - c));
            }
            Collections.sort(aList100);
            return Integer.toString(aList100.get(aList100.size() / 2));
            //return Integer.toString(Integer.parseInt(aList.get(aList.size() / 2)));
        }
        else {
            return "null";
        }
    }


}
