package de.dominikcattaux.quiztutorial;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static de.dominikcattaux.quiztutorial.R.string.scoreScreen;

public class Game extends AppCompatActivity implements View.OnClickListener{

    int currentQuestion = 0;
    private Button answerButton1, answerButton2, answerButton3, answerButton4;
    private TextView textViewQuestion, textViewScore;
    public int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        answerButton1 = findViewById(R.id.answerButton1);
        answerButton2 = findViewById(R.id.answerButton2);
        answerButton3 = findViewById(R.id.answerButton3);
        answerButton4 = findViewById(R.id.answerButton4);

        textViewQuestion = findViewById(R.id.textViewQuestion);
        textViewScore = findViewById(R.id.textViewScore);

        answerButton1.setOnClickListener(this);
        answerButton2.setOnClickListener(this);
        answerButton3.setOnClickListener(this);
        answerButton4.setOnClickListener(this);

        loadQuestions();
    }

        @SuppressLint({"DefaultLocale", "SetTextI18n"})
        private void loadQuestions () {
            Questions questionsObj = new Questions();
            ArrayList<String[]> questions = questionsObj.getQuestions();
            String[] question = questions.get(currentQuestion);

            int randomNumber = (int) (Math.random() * (4) + 1);

            switch (randomNumber) {
                case 1:
                    answerButton1.setText(question[1]);
                    answerButton2.setText(question[2]);
                    answerButton3.setText(question[3]);
                    answerButton4.setText(question[4]);
                    break;
                case 2:
                    answerButton1.setText(question[4]);
                    answerButton2.setText(question[1]);
                    answerButton3.setText(question[2]);
                    answerButton4.setText(question[3]);
                    break;
                case 3:
                    answerButton1.setText(question[3]);
                    answerButton2.setText(question[4]);
                    answerButton3.setText(question[1]);
                    answerButton4.setText(question[2]);
                    break;
                case 4:
                    answerButton1.setText(question[2]);
                    answerButton2.setText(question[3]);
                    answerButton3.setText(question[4]);
                    answerButton4.setText(question[1]);
                    break;
            }
            textViewQuestion.setText(question[0]);
            textViewScore.setText(getString(R.string.scoreScreen, score));
        }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answerButton1:
                if(evaluation(answerButton1.getText().toString()))  {
                score++;
                }
                if(currentQuestion >= 1) {
                    Intent intent = new Intent(this, FinalScreenActivity.class);
                    intent.putExtra("Punkte", score);
                    startActivity(intent);
                }else {
                    currentQuestion++;
                    loadQuestions();
                }
                break;
            case R.id.answerButton2:
                if(evaluation(answerButton2.getText().toString()))  {
                    score++;
                }
                if(currentQuestion >= 1) {
                    Intent intent = new Intent(this, FinalScreenActivity.class);
                    intent.putExtra("Punkte", score);
                    startActivity(intent);
                }else {
                    currentQuestion++;
                    loadQuestions();
                }
                break;
            case R.id.answerButton3:
                if(evaluation(answerButton3.getText().toString()))  {
                    score++;
                }
                if(currentQuestion >= 1) {
                    Intent intent = new Intent(this, FinalScreenActivity.class);
                    intent.putExtra("Punkte", score);
                    startActivity(intent);
                }else {
                    currentQuestion++;
                    loadQuestions();
                }
                break;
            case R.id.answerButton4:
                if(evaluation(answerButton4.getText().toString()))  {
                    score++;
                }
                if(currentQuestion >= 1) {
                    Intent intent = new Intent(this, FinalScreenActivity.class);
                    intent.putExtra("Punkte", score);
                    startActivity(intent);
                }else {
                    currentQuestion++;
                    loadQuestions();
                }
                break;
        }
    }

    private boolean evaluation(String btnText)  {
         boolean result = false;
        Questions questionObj = new Questions();
        ArrayList<String[]> questions = questionObj.getQuestions();
        String[] question = questions.get(currentQuestion);
        if(question[1].equals(btnText)) result = true;
        return result;
    }
}
