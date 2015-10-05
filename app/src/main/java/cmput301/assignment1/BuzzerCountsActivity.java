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
