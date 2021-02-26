package mcm.edu.ph.act2_abstruse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

public class GameoverScreen extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView story = findViewById(R.id.storytxt);


        story.setText("With the blunt force of your neck jab, you instantly knocked him out.\n \n \n" +
                "YOU'VE WON THE FIGHT AND JASON NEVER BOTHERED YOU AND YOUR SISTER SINCE THEN. \n \n" +
                "GAME OVER.");
        button = (Button) findViewById(R.id.tryAgain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent tryagain = new Intent(this, MainActivity.class);
        startActivity(tryagain);

    }
}