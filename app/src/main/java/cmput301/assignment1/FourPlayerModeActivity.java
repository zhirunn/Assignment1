package cmput301.assignment1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by JustinWong on 15-09-30.
 */
public class FourPlayerModeActivity extends Activity{

    numberofclicks clicks = new numberofclicks();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourplayer);
    }
    @Override
    protected void onStart() {
        super.onStart();
        ImageButton p1Button = (ImageButton) findViewById(R.id.buttonP1);
        ImageButton p2Button = (ImageButton) findViewById(R.id.buttonP2);
        ImageButton p3Button = (ImageButton) findViewById(R.id.buttonP3);
        ImageButton p4Button = (ImageButton) findViewById(R.id.buttonP4);
        p1Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks.p1_4++;
                AlertDialog.Builder builder = new AlertDialog.Builder(FourPlayerModeActivity.this);
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
                clicks.p2_4++;
                AlertDialog.Builder builder = new AlertDialog.Builder(FourPlayerModeActivity.this);
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

        p3Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks.p3_4++;
                AlertDialog.Builder builder = new AlertDialog.Builder(FourPlayerModeActivity.this);
                builder.setTitle("Player3 Clicked The Button!")
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

        p4Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks.p4_4++;
                AlertDialog.Builder builder = new AlertDialog.Builder(FourPlayerModeActivity.this);
                builder.setTitle("Player4 Clicked The Button!")
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