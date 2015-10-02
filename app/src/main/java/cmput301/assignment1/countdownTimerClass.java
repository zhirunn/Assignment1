/*

package cmput301.assignment1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

*/

/**
 * Created by JustinWong on 15-09-30.
 */

/*


public class countdownTimerClass extends CountDownTimer{

    double randND = 20+2000*Math.random();
    private final long randNL = Math.round(randND);

    public countdownTimerClass(randNL, 1000) {
        super(randNL, 1000);
    }


























    private CountDownTimer countDownTimer;

    countDownTimer = new CountDownTimer(randNL, 1000) {
        public void onTick(long millisUntilFinished) {
            ImageButton mainButton2 = (ImageButton) findViewById(R.id.buttonMain2);
            ImageButton mainButton = (ImageButton) findViewById(R.id.buttonMain);
            mainButton2.setVisibility(View.GONE);
            mainButton.setVisibility(View.VISIBLE);
            mainButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    TextView text=(TextView)findViewById(R.id.trainingTextView);
                    text.setText("TOO EARLY!!!!");
                    cancel();
                    start();
                }
            });
        }

    public void onFinish() {
        TextView text=(TextView)findViewById(R.id.trainingTextView);
        text.setText("PRESS THE BUTTON!!!!!");
        ImageButton mainButton = (ImageButton) findViewById(R.id.buttonMain);
        ImageButton mainButton2 = (ImageButton) findViewById(R.id.buttonMain2);
        mainButton.setVisibility(View.GONE);
        mainButton2.setVisibility(View.VISIBLE);
        final long initialTime = System.currentTimeMillis();
        mainButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SinglePlayerModeActivity.this);
                builder.setTitle("You Did It!")
                        .setMessage("Your time was " + (System.currentTimeMillis() - initialTime) + " milliseconds. Play Again ?")
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int num) {
                                dialog.cancel();
                                Intent intent = getIntent();
                                finish();
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int num) {
                                dialog.cancel();
                                finish();
                            }
                        });
                AlertDialog message = builder.create();
                message.show();
            }
        });

    }
};




}

*/