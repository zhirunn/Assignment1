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
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by JustinWong on 15-10-03.
 */
public class ShowElementsInArrayListActivity extends Activity {

    loadingFiles loading = new loadingFiles();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listmain_reactions);

        loading.reactionTimesList = (ListView) findViewById(R.id.reactionTimesList);
        loading.adapter = new ArrayAdapter<String>(this, R.layout.list_reactions, loading.Rtimes);
        loading.reactionTimesList.setAdapter(loading.adapter);

    }
}
