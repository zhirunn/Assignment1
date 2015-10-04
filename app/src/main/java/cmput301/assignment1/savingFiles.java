package cmput301.assignment1;

import android.app.Activity;
import android.content.Context;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by JustinWong on 15-10-02.
 */
public class savingFiles {

    public static final String FILENAME = "reaction.sav";

    public void saveInFile(int num, Context ctx) {
        FileOutputStream fos;
        try {
            fos = ctx.openFileOutput(FILENAME, 0);
            OutputStreamWriter writer = new OutputStreamWriter(fos);
            writer.write(Integer.toString(num));
            writer.flush();
            writer.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
