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

public class Result extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		Listener();
	}
	public void Listener() {
		TextView story = findViewById(R.id.storytxt);
		Button tryAgain = findViewById(R.id.tryAgain);
		story.setText("With the blunt force of your neck jab, you instantly knocked him out.\n \n \n" +
				"YOU'VE WON THE FIGHT AND JASON NEVER BOTHERED YOU AND YOUR SISTER SINCE THEN. \n \n" +
				"GAME OVER.");
		tryAgain.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent tryagain = new Intent(Result.this, MainActivity.class);
				startActivity(tryagain);
			}
		});
	}
}

