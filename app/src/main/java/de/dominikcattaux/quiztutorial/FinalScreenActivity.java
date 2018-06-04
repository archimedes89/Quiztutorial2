package de.dominikcattaux.quiztutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static de.dominikcattaux.quiztutorial.R.string.scoreScreen;

public class FinalScreenActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonStartPage;
    TextView textViewFinal;

    private int finalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);

        buttonStartPage = findViewById(R.id.buttonStartPage);
        textViewFinal = findViewById(R.id.textViewFinal);

        buttonStartPage.setOnClickListener(this);
        textViewFinal.setText(scoreScreen);
    }

    @Override
    public void onClick(View v) {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
    }
}
