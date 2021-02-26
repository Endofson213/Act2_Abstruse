package mcm.edu.ph.act2_abstruse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lead2 extends AppCompatActivity {

    MediaPlayer leadChoice2;
    MediaPlayer wrongChoice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Listener();
    }

    public void Listener() {
        Button choice1 = findViewById(R.id.choice1);
        Button choice2 = findViewById(R.id.choice2);
        TextView story = findViewById(R.id.storytxt);
        story.setText("You successfully freed yourself from his firm grasps and swung your fist to his stomach. \n \n \n" +
                "He tries to recover then suddenly attempts to throw a hook towards your jaw. You:");
        choice1.setText("Use your forearm to block");
        choice2.setText("Pause and think");
        choice1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                leadChoice2 = MediaPlayer.create(Lead2.this, R.raw.lead2_correct);
                leadChoice2.start();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {

                    public void run() {
                        Intent lead3 = new Intent(Lead2.this, Lead3.class);
                        startActivity(lead3);
                    }
                }, 1000);
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                wrongChoice2 = MediaPlayer.create(Lead2.this, R.raw.wrong2_wrong);
                wrongChoice2.start();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {

                        Intent wrong3 = new Intent(Lead2.this, Wrong3.class);
                        startActivity(wrong3);
                    }
                }, 1000);
            }
        });
    }
}
