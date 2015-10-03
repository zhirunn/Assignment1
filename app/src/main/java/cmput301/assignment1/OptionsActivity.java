package cmput301.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by JustinWong on 15-09-25.
 */
public class OptionsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        ImageButton RTButton = (ImageButton) findViewById(R.id.buttonReactionTime);
        ImageButton BCButton = (ImageButton) findViewById(R.id.buttonBuzzerCount);

        RTButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OptionsActivity.this, ReactionTimesActivity.class));
            }
        });
        BCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OptionsActivity.this, BuzzerCountsActivity.class));
            }
        });

    }
}
