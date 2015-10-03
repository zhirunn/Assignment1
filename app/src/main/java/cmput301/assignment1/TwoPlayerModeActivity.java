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
 * Created by JustinWong on 15-09-30.
 */
public class TwoPlayerModeActivity extends Activity{

    private CountDownTimer countDownTimer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoplayer);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Instructions")
                .setMessage("Press the button when you are prompted.")
                .setCancelable(false)
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
                ImageButton p1Button = (ImageButton) findViewById(R.id.buttonP1_2);
                ImageButton p1_2Button = (ImageButton) findViewById(R.id.buttonP1);
                p1_2Button.setVisibility(View.GONE);
                p1Button.setVisibility(View.VISIBLE);
                ImageButton p2Button = (ImageButton) findViewById(R.id.buttonP2_2);
                ImageButton p2_2Button = (ImageButton) findViewById(R.id.buttonP2);
                p2_2Button.setVisibility(View.GONE);
                p2Button.setVisibility(View.VISIBLE);
                p1Button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView text1 = (TextView) findViewById(R.id.player1TextView);
                        text1.setText("TOO EARLY!!!!");
                        cancel();
                        start();
                    }
                });
                p2Button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView text2 = (TextView) findViewById(R.id.player2TextView);
                        text2.setText("TOO EARLY!!!!");
                        cancel();
                        start();
                    }
                });
            }

            public void onFinish() {
                ImageButton p1Button = (ImageButton) findViewById(R.id.buttonP1);
                ImageButton p1_2Button = (ImageButton) findViewById(R.id.buttonP1_2);
                ImageButton p2Button = (ImageButton) findViewById(R.id.buttonP2);
                ImageButton p2_2Button = (ImageButton) findViewById(R.id.buttonP2_2);
                p1Button.setVisibility(View.GONE);
                p1_2Button.setVisibility(View.VISIBLE);
                p2Button.setVisibility(View.GONE);
                p2_2Button.setVisibility(View.VISIBLE);
                TextView text1=(TextView)findViewById(R.id.player1TextView);
                text1.setText("PRESS!!!");
                TextView text2=(TextView)findViewById(R.id.player2TextView);
                text2.setText("PRESS!!!");
                final long initialTime = System.currentTimeMillis();
                p1_2Button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(TwoPlayerModeActivity.this);
                        builder.setTitle("Player1 Clicked The Button!")
                                .setCancelable(false)
                                .setMessage("Player1's time was " + (System.currentTimeMillis() - initialTime) + " milliseconds. Play Again ?")
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
                p2_2Button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(TwoPlayerModeActivity.this);
                        builder.setTitle("Player2 Clicked The Button!")
                                .setCancelable(false)
                                .setMessage("Player2's time was " + (System.currentTimeMillis() - initialTime) + " milliseconds. Play Again ?")
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
