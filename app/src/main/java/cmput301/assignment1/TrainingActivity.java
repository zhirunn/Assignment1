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

/**
 * Created by JustinWong on 15-09-25.
 */

public class TrainingActivity extends Activity{
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

         AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("How to Play")
                .setMessage("Press the button when you hear the buzz. You will also be prompted to press the button.")
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
        //Testing random numbers - double randND = 1+9*Math.random();
        double randND = 2000*Math.random();
        long randNL = Math.round(randND);

        countDownTimer = new CountDownTimer(randNL, 1000) {
            public void onTick(long millisUntilFinished) {
                //Testing seconds countdown
                //TextView text=(TextView)findViewById(R.id.trainingTextView);
                //text.setText("Seconds Remaining: " + millisUntilFinished/1000);
                ImageButton mainButton2 = (ImageButton) findViewById(R.id.buttonMain2);
                ImageButton mainButton = (ImageButton) findViewById(R.id.buttonMain);
                mainButton2.setVisibility(View.GONE);
                mainButton.setVisibility(View.VISIBLE);
                mainButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Testing Button Press
                        TextView text=(TextView)findViewById(R.id.trainingTextView);
                        text.setText("TOO EARLY!!!!");
                        cancel();
                        start();
                        //Earlier Implementation of Code
                        //AlertDialog.Builder builder = new AlertDialog.Builder(TrainingActivity.this);
                        //builder.setTitle("Error")
                        //        .setMessage("You Pressed Too Early. Try Again?")
                        //        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        //            public void onClick(DialogInterface dialog, int num) {
                        //                dialog.cancel();
                        //                Intent intent = getIntent();
                        //                finish();
                        //                startActivity(intent);
                        //            }
                        //        })
                        //        .setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
                        //            public void onClick(DialogInterface dialog, int num) {
                        //                dialog.cancel();
                        //                finish();
                        //            }
                        //        });
                        //AlertDialog message = builder.create();
                        //message.show();
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(TrainingActivity.this);
                        //reactionTimes.add(System.currentTimeMillis() - startTime);
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
}

