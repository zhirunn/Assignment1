package cmput301.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by JustinWong on 15-10-02.
 */
public class BuzzerCountsActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buzzercounts);

        ImageButton twoCountButton = (ImageButton) findViewById(R.id.button2Count);
        ImageButton threeCountButton = (ImageButton) findViewById(R.id.button3Count);
        ImageButton fourCountButton = (ImageButton) findViewById(R.id.button4Count);


        twoCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuzzerCountsActivity.this, ButtonClick2P_Activity.class));
            }
        });
        threeCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuzzerCountsActivity.this, ButtonClick3P_Activity.class));
            }
        });
        fourCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BuzzerCountsActivity.this, ButtonClick4P_Activity.class));
            }
        });
    }

}
