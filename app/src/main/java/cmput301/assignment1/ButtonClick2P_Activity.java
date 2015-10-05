package cmput301.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by JustinWong on 15-10-04.
 */
public class ButtonClick2P_Activity extends Activity {

    numberofclicks clicks = new numberofclicks();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonclick2p);

    }
    protected void onStart() {
        super.onStart();

        TextView text = (TextView) findViewById(R.id.player1_2ClicksResultTextView);
        text.setText(Integer.toString(clicks.p1_2));

        TextView text2 = (TextView) findViewById(R.id.player2_2ClicksResultTextView);
        text2.setText(Integer.toString(clicks.p2_2));
    }

}