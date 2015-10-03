package cmput301.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by JustinWong on 15-09-30.
 */
public class MultiPlayerModeActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);

        ImageButton twoplayerButton = (ImageButton) findViewById(R.id.button2Players);
        ImageButton threeplayerButton = (ImageButton) findViewById(R.id.button3Players);
        ImageButton fourplayerButton = (ImageButton) findViewById(R.id.button4Players);


        twoplayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MultiPlayerModeActivity.this, TwoPlayerModeActivity.class));
            }
        });
        threeplayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MultiPlayerModeActivity.this, ThreePlayerModeActivity.class));
            }
        });
        fourplayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MultiPlayerModeActivity.this, FourPlayerModeActivity.class));
            }
        });
    }

}
