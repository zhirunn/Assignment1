package cmput301.assignment1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by JustinWong on 15-10-02.
 */
public class ReactionTimesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reactiontimes);

        ImageButton listelementsButton = (ImageButton) findViewById(R.id.buttonListElements);
        ImageButton statisticsButton = (ImageButton) findViewById(R.id.buttonStatistics);

        listelementsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReactionTimesActivity.this, ShowElementsInArrayListActivity.class));
            }
        });
        statisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ReactionTimesActivity.this, ReactionStatsActivity.class));
            }
        });

    }

}
