package mcm.edu.ph.act2_abstruse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lead3 extends AppCompatActivity {

    MediaPlayer leadChoice3;

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
        story.setText("You use your advantage to counter hook him, striking his cheekbone.\n \n \n" +
                "You reposition yourself and finish him off with:");
        choice1.setText("A jab to his neck");
        choice2.setText("An elbow strike to the sternum");
        choice1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                leadChoice3 = MediaPlayer.create(Lead3.this, R.raw.lead3_correct);
                leadChoice3.start();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {

                    public void run() {
                        Intent win = new Intent(Lead3.this, GameoverScreen.class);
                        startActivity(win);
                    }
                }, 1000);
            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                leadChoice3 = MediaPlayer.create(Lead3.this, R.raw.lead3_correct);
                leadChoice3.start();

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        Intent win2 = new Intent(Lead3.this, Result.class);
                        startActivity(win2);
                    }

                }, 1000);
            }
        });
    }
}