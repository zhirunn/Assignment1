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
import java.util.NoSuchElementException;

/**
 * Created by JustinWong on 15-10-04.
 */
public class ReactionStatsActivity extends Activity {

    calculations calc = new calculations();
    loadingFiles load = new loadingFiles();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reactionstats);
    }

    protected void onStart() {
        super.onStart();

        try {
            TextView textmin = (TextView) findViewById(R.id.minimumLAllDisplayTextView);
            textmin.setText(calc.minValue(load.Rtimes));

            TextView textmin10 = (TextView) findViewById(R.id.minimumL10DisplayTextView);
            textmin10.setText(calc.min10Value(load.Rtimes));

            TextView textmin100 = (TextView) findViewById(R.id.minimumL100DisplayTextView);
            textmin100.setText(calc.min100Value(load.Rtimes));

            TextView textmax = (TextView) findViewById(R.id.maximumLAllDisplayTextView);
            textmax.setText(calc.maxValue(load.Rtimes));

            TextView textmax10 = (TextView) findViewById(R.id.maximumL10DisplayTextView);
            textmax10.setText(calc.max10Value(load.Rtimes));

            TextView textmax100 = (TextView) findViewById(R.id.maximumL100DisplayTextView);
            textmax100.setText(calc.max100Value(load.Rtimes));

            TextView textavr = (TextView) findViewById(R.id.averageLAllDisplayTextView);
            textavr.setText(calc.averageValue(load.Rtimes));

            TextView textavr10 = (TextView) findViewById(R.id.averageL10DisplayTextView);
            textavr10.setText(calc.average10Value(load.Rtimes));

            TextView textavr100 = (TextView) findViewById(R.id.averageL100DisplayTextView);
            textavr100.setText(calc.average100Value(load.Rtimes));

            TextView textmed = (TextView) findViewById(R.id.medianLAllDisplayTextView);
            textmed.setText(calc.medianValue(load.Rtimes));

            TextView textmed10 = (TextView) findViewById(R.id.medianL10DisplayTextView);
            textmed10.setText(calc.median10Value(load.Rtimes));

            TextView textmed100 = (TextView) findViewById(R.id.medianL100DisplayTextView);
            textmed100.setText(calc.median100Value(load.Rtimes));

        } catch (NoSuchElementException e) {
            TextView textmin = (TextView) findViewById(R.id.minimumLAllDisplayTextView);
            textmin.setText("null");

            TextView textmax = (TextView) findViewById(R.id.maximumLAllDisplayTextView);
            textmax.setText("null");

            TextView textavr = (TextView) findViewById(R.id.averageLAllDisplayTextView);
            textavr.setText("null");

            TextView textmed = (TextView) findViewById(R.id.medianLAllDisplayTextView);
            textmed.setText("null");

        } catch (IndexOutOfBoundsException e) {
            TextView textmin = (TextView) findViewById(R.id.minimumLAllDisplayTextView);
            textmin.setText("null");

            TextView textmax = (TextView) findViewById(R.id.maximumLAllDisplayTextView);
            textmax.setText("null");

            TextView textavr = (TextView) findViewById(R.id.averageLAllDisplayTextView);
            textavr.setText("null");

            TextView textmed = (TextView) findViewById(R.id.medianLAllDisplayTextView);
            textmed.setText("null");
        }

    }

}
