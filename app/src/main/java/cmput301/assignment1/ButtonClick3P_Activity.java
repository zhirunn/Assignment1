package cmput301.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by JustinWong on 15-10-04.
 */
public class ButtonClick3P_Activity extends Activity {

    numberofclicks clicks = new numberofclicks();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonclick3p);

    }
    protected void onStart() {
        super.onStart();

        TextView text = (TextView) findViewById(R.id.player1_3ClicksResultTextView);
        text.setText(Integer.toString(clicks.p1_3));

        TextView text2 = (TextView) findViewById(R.id.player2_3ClicksResultTextView);
        text2.setText(Integer.toString(clicks.p2_3));

        TextView text3 = (TextView) findViewById(R.id.player3_3ClicksResultTextView);
        text3.setText(Integer.toString(clicks.p3_3));

    }

}