package cmput301.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton oneButton = (ImageButton) findViewById(R.id.buttonOne);
        ImageButton twoButton = (ImageButton) findViewById(R.id.buttonTwo);
        ImageButton threeButton = (ImageButton) findViewById(R.id.buttonThree);
        ImageButton fourButton = (ImageButton) findViewById(R.id.buttonFour);
        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SinglePlayerModeActivity.class));
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MultiPlayerModeActivity.class));
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StatisticsActivity.class));
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingFiles.Rtimes.clear();
                setResult(RESULT_OK);
                numberofclicks.p1_2 = 0;
                numberofclicks.p2_2 = 0;
                numberofclicks.p1_3 = 0;
                numberofclicks.p2_3 = 0;
                numberofclicks.p3_3 = 0;
                numberofclicks.p1_4 = 0;
                numberofclicks.p2_4 = 0;
                numberofclicks.p3_4 = 0;
                numberofclicks.p4_4 = 0;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
