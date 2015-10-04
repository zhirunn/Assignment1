package cmput301.assignment1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by JustinWong on 15-10-03.
 */
public class MinReactionsActivity extends Activity {

    loadingFiles loading = new loadingFiles();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_reactions);

        loading.reactionTimesList = (ListView) findViewById(R.id.reactionTimesList);
        loading.adapter = new ArrayAdapter<String>(this, R.layout.list_reactions, loading.Rtimes);
        loading.reactionTimesList.setAdapter(loading.adapter);
        //loading.adapter.notifyDataSetChanged();


        loading.loadFromFile(getApplicationContext());

    }
}
