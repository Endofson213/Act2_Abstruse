package mcm.edu.ph.act2_abstruse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class Lead1 extends AppCompatActivity {
    MediaPlayer leadChoice1;
    MediaPlayer leadWrong1;

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
        story.setText("You managed to dodge his uppercut by swinging back and countering his attack. \n \n \n" +
                "Then he grabs a fist full of your collar and uses his strong hand to strike your face. Your anger intensifies, so you:");
        choice1.setText("Jab his hand away from your collar");
        choice2.setText("Grab his shirt and punch furiously");
        choice1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                leadChoice1 = MediaPlayer.create(Lead1.this, R.raw.lead2_correct);
                leadChoice1.start();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Intent lead2 = new Intent(Lead1.this, Lead2.class);
                        startActivity(lead2);
                    }
                }, 1000);
            }
        });
        choice2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                leadWrong1 = MediaPlayer.create(Lead1.this, R.raw.wrong2_wrong);
                leadWrong1.start();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {


                    public void run() {
                        Intent wrong2 = new Intent(Lead1.this, Wrong2.class);
                        startActivity(wrong2);
                    }
                }, 1000);
            }
        });
    }
}