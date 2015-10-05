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
