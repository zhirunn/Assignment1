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
