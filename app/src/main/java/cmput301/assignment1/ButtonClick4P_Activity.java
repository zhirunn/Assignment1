package cmput301.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by JustinWong on 15-10-04.
 */
public class ButtonClick4P_Activity extends Activity {

    numberofclicks clicks = new numberofclicks();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonclick4p);

    }
    protected void onStart() {
        super.onStart();

        TextView text = (TextView) findViewById(R.id.player1_4ClicksResultTextView);
        text.setText(Integer.toString(clicks.p1_4));

        TextView text2 = (TextView) findViewById(R.id.player2_4ClicksResultTextView);
        text2.setText(Integer.toString(clicks.p2_4));

        TextView text3 = (TextView) findViewById(R.id.player3_4ClicksResultTextView);
        text3.setText(Integer.toString(clicks.p3_4));

        TextView text4 = (TextView) findViewById(R.id.player4_4ClicksResultTextView);
        text4.setText(Integer.toString(clicks.p4_4));

    }

}