package cmput301.assignment1;

import android.app.Activity;
import android.content.Context;
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


    public void saveInFile(int num, Context ctx) {
        FileOutputStream fos;
        try {
            //next line has some strange bug. crashes the app
            fos = ctx.openFileOutput(FILENAME, MODE_PRIVATE);
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
