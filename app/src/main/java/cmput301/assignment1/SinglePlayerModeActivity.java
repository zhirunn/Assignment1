package cmput301.assignment1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by JustinWong on 15-09-25.
 */

public class SinglePlayerModeActivity extends Activity{

    //not used
    //private static final String FILENAME = "reaction.sav";
    private CountDownTimer countDownTimer;
    savingFiles saving = new savingFiles();

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleplayer);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Instructions")
                .setCancelable(false)
                .setMessage("Press the button when you are prompted.")
                .setNegativeButton(android.R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int num) {
                        dialog.cancel();
                        countDownTimer.start();
                    }
                });
        AlertDialog message = builder.create();
        message.show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        double randND = 10+2000*Math.random();
        long randNL = Math.round(randND);

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
                ImageButton mainButton = (ImageButton) findViewById(R.id.buttonMain);
                ImageButton mainButton2 = (ImageButton) findViewById(R.id.buttonMain2);
                mainButton.setVisibility(View.GONE);
                mainButton2.setVisibility(View.VISIBLE);
                TextView text=(TextView)findViewById(R.id.trainingTextView);
                text.setText("PRESS THE BUTTON!!!");
                final long initialTime = System.currentTimeMillis();
                mainButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        long ltimes = (System.currentTimeMillis() - initialTime);
                        int itimes = (int) ltimes;
                        //next line used to cause the app to crash.
                        saving.saveInFile(itimes + '\n', getApplicationContext());
                        AlertDialog.Builder builder = new AlertDialog.Builder(SinglePlayerModeActivity.this);
                        builder.setTitle("You Did It!")
                                .setCancelable(false)
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
}

