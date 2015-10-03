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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twoplayer);
    }
    @Override
    protected void onStart() {
        super.onStart();
        ImageButton p1Button = (ImageButton) findViewById(R.id.buttonP1);
        ImageButton p2Button = (ImageButton) findViewById(R.id.buttonP2);
        p1Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TwoPlayerModeActivity.this);
                builder.setTitle("Player1 Clicked The Button!")
                        .setCancelable(false)
                        .setMessage("Play Again ?")
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

        p2Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TwoPlayerModeActivity.this);
                builder.setTitle("Player2 Clicked The Button!")
                        .setCancelable(false)
                        .setMessage("Play Again ?")
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
}