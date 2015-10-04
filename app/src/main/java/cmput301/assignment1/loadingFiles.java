package cmput301.assignment1;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by JustinWong on 15-10-03.
 */
public class loadingFiles extends Activity {

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
            while ((line = read.readLine()) != null)
            {
                Rtimes.add(line);
            }
            read.close();
            fis.close();

            //Scanner read = new Scanner(fis);
            //while (read.hasNextLine())
            //{
            //    Rtimes.add(read.next());
            //}

        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            Rtimes = new ArrayList<String>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
