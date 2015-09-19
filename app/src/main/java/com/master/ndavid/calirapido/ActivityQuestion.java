package com.master.ndavid.calirapido;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class ActivityQuestion extends ActionBarActivity {

    private Trivia trivia;
    private TextView txt_question;
    private Button answer_a;
    private Button answer_b;
    private Button answer_c;
    private Button answer_d;

    public void initialize(){
        trivia = new Trivia();
        txt_question = (TextView) findViewById(R.id.txt_question);
        answer_a = (Button) findViewById(R.id.button);
        answer_b = (Button) findViewById(R.id.button2);
        answer_c = (Button) findViewById(R.id.button3);
        answer_d = (Button) findViewById(R.id.button4);
    }
    public void setQuestion(){
      ArrayList<Question> questions = trivia.getQuestions();
      Question question = questions.get(0);
      ArrayList<Answer> optionsAnswer = question.getOptionsAnswers();
      txt_question.setText(question.getQuestion());
      answer_a.setText(optionsAnswer.get(0).getAnswer());
      answer_b.setText(optionsAnswer.get(1).getAnswer());
      answer_c.setText(optionsAnswer.get(2).getAnswer());
      answer_d.setText(optionsAnswer.get(3).getAnswer());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        initialize();
        setQuestion();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_question, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
