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

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by JustinWong on 15-10-03.
 */
public class loadingFiles {

    public static final String FILENAME = "reaction.sav";

    public static ArrayList<String> Rtimes = new ArrayList<String>();
    public ListView reactionTimesList;
    public ArrayAdapter<String> adapter;


    public void loadFromFile(Context cxt) {
        FileInputStream fis;
        try {
            fis = cxt.openFileInput(FILENAME);

            BufferedReader read = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = read.readLine()) != null) {
                Rtimes.add(line);
            }
            read.close();
            fis.close();

        } catch (FileNotFoundException e) {
            Rtimes = new ArrayList<String>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
