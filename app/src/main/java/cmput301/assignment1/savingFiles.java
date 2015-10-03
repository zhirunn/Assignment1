package cmput301.assignment1;

import android.app.Activity;
import android.widget.EditText;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/**
 * Created by JustinWong on 15-10-02.
 */
public class savingFiles extends Activity {

    public static final String FILENAME = "reaction.sav";
    public EditText saveText;
    public ArrayList<ArrayofTimes> Rtimes = new ArrayList<ArrayofTimes>();

    //doesn't work. id.body is in main_reactions.xml
    //saveText = (EditText) findViewById(R.id.body);




    public void saveInFile(int num) {
        try {
            //next line has some strange bug. crashes the app
            FileOutputStream fos = openFileOutput(FILENAME, 0);
            OutputStreamWriter writer = new OutputStreamWriter(fos);
            writer.write(num);
            writer.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
