/**
 Copyright 2015 Justin Wong

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.

 */

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
public class ThreePlayerModeActivity extends Activity{

    numberofclicks clicks = new numberofclicks();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_threeplayer);
    }
    @Override
    protected void onStart() {
        super.onStart();
        ImageButton p1Button = (ImageButton) findViewById(R.id.buttonP1);
        ImageButton p2Button = (ImageButton) findViewById(R.id.buttonP2);
        ImageButton p3Button = (ImageButton) findViewById(R.id.buttonP3);
        p1Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clicks.p1_3++;
                AlertDialog.Builder builder = new AlertDialog.Builder(ThreePlayerModeActivity.this);
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
                clicks.p2_3++;
                AlertDialog.Builder builder = new AlertDialog.Builder(ThreePlayerModeActivity.this);
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
                clicks.p3_3++;
                AlertDialog.Builder builder = new AlertDialog.Builder(ThreePlayerModeActivity.this);
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
    }
}