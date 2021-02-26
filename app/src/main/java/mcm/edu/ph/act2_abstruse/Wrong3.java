package mcm.edu.ph.act2_abstruse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Wrong3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong3);
        Listener();
    }

    public void Listener() {
        Button choice1 = findViewById(R.id.choice1);
        TextView story = findViewById(R.id.storytxt);
        story.setText("Jason was too fast before you could defend yourself. You got hit badly in your jaw. \n \n" +
                "GAME OVER.");
        choice1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent restart3 = new Intent(Wrong3.this, MainActivity.class);
                startActivity(restart3);

            }
        });
    }
}