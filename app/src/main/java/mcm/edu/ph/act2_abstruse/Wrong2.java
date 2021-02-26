package mcm.edu.ph.act2_abstruse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Wrong2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong2);
        Listener();
    }
    public void Listener() {
        Button choice1 = findViewById(R.id.choice1);
        TextView story = findViewById(R.id.storytxt);
        story.setText("He's still has a hold on your collar. Both of you are just hitting back and forth in the same manner until the two of you got exhausted. \n \n" +
                "GAME OVER.");
        choice1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent restart2 = new Intent(Wrong2.this,MainActivity.class);
                startActivity(restart2);
            }
        });
    }
}