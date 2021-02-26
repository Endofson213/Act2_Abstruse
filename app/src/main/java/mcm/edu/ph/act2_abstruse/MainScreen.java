package mcm.edu.ph.act2_abstruse;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainScreen extends AppCompatActivity {

MediaPlayer specialbtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abstruse_main_screen);
        Listener();
    }

    public void Listener() {
        Button startApp = findViewById(R.id.startApp);
        Button specialbtn2 = findViewById(R.id.specialBtn);

        startApp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent startApp = new Intent(MainScreen.this, MainActivity.class);
                startActivity(startApp);
            }
        });
        specialbtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                specialbtn1 = MediaPlayer.create(MainScreen.this, R.raw.special_effect);
                specialbtn1.start();
            }
        });

    }
}

