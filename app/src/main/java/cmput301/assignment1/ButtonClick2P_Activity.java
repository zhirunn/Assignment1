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
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by JustinWong on 15-10-04.
 */
public class ButtonClick2P_Activity extends Activity {

    numberofclicks clicks = new numberofclicks();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonclick2p);

    }
    protected void onStart() {
        super.onStart();

        TextView text = (TextView) findViewById(R.id.player1_2ClicksResultTextView);
        text.setText(Integer.toString(clicks.p1_2));

        TextView text2 = (TextView) findViewById(R.id.player2_2ClicksResultTextView);
        text2.setText(Integer.toString(clicks.p2_2));
    }

}