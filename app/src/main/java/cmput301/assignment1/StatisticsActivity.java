package cmput301.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.NoSuchElementException;

/**
 * Created by JustinWong on 15-10-04.
 */
public class StatisticsActivity extends Activity {

    calculations calc = new calculations();
    loadingFiles load = new loadingFiles();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
    }

    protected void onStart() {
        super.onStart();

        try {
            TextView textmin = (TextView) findViewById(R.id.minimumLAllDisplayTextView);
            textmin.setText(calc.minValue(load.Rtimes));

            TextView textmax = (TextView) findViewById(R.id.maximumLAllDisplayTextView);
            textmax.setText(calc.maxValue(load.Rtimes));

        } catch (NoSuchElementException e) {
            TextView textmin = (TextView) findViewById(R.id.minimumLAllDisplayTextView);
            textmin.setText("null");

            TextView textmax = (TextView) findViewById(R.id.maximumLAllDisplayTextView);
            textmax.setText("null");
        }

    }

}
