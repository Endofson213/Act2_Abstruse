package mcm.edu.ph.act2_abstruse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MediaPlayer leadChoice1;
    MediaPlayer wrongChoice1;

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
        story.setText("You found out that your sister was harassed by Jason, a fellow senior like you. Raging in anger, you confronted Jason at the school courtyard telling him to back off and stay away from your sister but then Jason only took it as a joke and started mocking your sister which lead you into a raging frenzy and punched him in the face. \n \n \n" +
                "He looks at you and charges with a left uppercut \n \n" +
                "What do you do?");
        choice1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                wrongChoice1 = MediaPlayer.create(MainActivity.this, R.raw.wrong1_wrong);
                wrongChoice1.start();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {

                    public void run() {
                        Intent wrong1 = new Intent(MainActivity.this, Wrong1.class);
                        startActivity(wrong1);

                    }
                }, 1000);
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                leadChoice1 = MediaPlayer.create(MainActivity.this, R.raw.lead1_correct);
                leadChoice1.start();


                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Intent lead1 = new Intent(MainActivity.this, Lead1.class);
                        startActivity(lead1);
                    }
                }, 1000);
            }
        });
    }
}