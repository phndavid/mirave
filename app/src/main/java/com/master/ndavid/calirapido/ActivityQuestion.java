package com.master.ndavid.calirapido;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import android.media.MediaPlayer;

public class ActivityQuestion extends ActionBarActivity {

    private Trivia trivia;
    private TextView txt_question;
    private Button answer_a;
    private Button answer_b;
    private Button answer_c;
    private Button answer_d;
    private Button btn_replay;
    private int num_question;
    private String answerCorrect;
    private String feedback;
    private Typeface tf;
    private RelativeLayout relativeLayout;

    private  MediaPlayer mpMazamorra;
    private  MediaPlayer mpVea;

    public void initialize(){


        relativeLayout = (RelativeLayout) findViewById(R.id.relaQ);
        tf=Typeface.createFromAsset(getAssets(),"fonts/CaviarDreams.ttf");
        trivia = new Trivia();
        num_question = 0;
        answerCorrect = "";
        txt_question = (TextView) findViewById(R.id.txt_question);
        txt_question.setTypeface(tf);
        answer_a = (Button) findViewById(R.id.btn_answerA);
        answer_a.setTypeface(tf);
        answer_b = (Button) findViewById(R.id.btn_answerB);
        answer_b.setTypeface(tf);
        answer_c = (Button) findViewById(R.id.btn_answerC);
        answer_c.setTypeface(tf);
        answer_d = (Button) findViewById(R.id.btn_answerD);
        answer_d.setTypeface(tf);

        btn_replay = (Button) findViewById(R.id.btn_replay);
        btn_replay.setEnabled(false);

        mpMazamorra = MediaPlayer.create(this, R.raw.mazamorra);
        mpVea=MediaPlayer.create(this, R.raw.vea);




    }
    public void setQuestion(int num){
        ArrayList<Question> questions = trivia.getOnePlay();
        Question question = questions.get(num);
        int id = question.getId();
        int draId = getDrawableIdFromQuestionId(id);
        relativeLayout.setBackgroundResource(draId);
        ArrayList<Answer> optionsAnswer = question.getOptionsAnswers();
        txt_question.setText(question.getQuestion());
        answerCorrect = optionsAnswer.get(0).getAnswer();
        int[] answers = answerswithoutRepeating();
        answer_a.setText(optionsAnswer.get(answers[0]).getAnswer());
        answer_b.setText(optionsAnswer.get(answers[1]).getAnswer());
        answer_c.setText(optionsAnswer.get(answers[2]).getAnswer());
        answer_d.setText(optionsAnswer.get(answers[3]).getAnswer());
        feedback = question.getExplain();

    }
    public int[] answerswithoutRepeating(){
        int [] answers = new int[4];
        double a = Math.random()*5;
        int answerA = (int) a;
        if(answerA==4){
            answerA=3;
        }
        int answerB = 0;
        int answerC = 0;
        int answerD = 0;

        if(answerA==0){
            answerB=1;
            answerC=2;
            answerD=3;
        }
        if(answerA==1){
            answerB=2;
            answerC=3;
            answerD=0;
        }
        if(answerA==2){
            answerB=3;
            answerC=0;
            answerD=1;
        }
        if(answerA==3){
            answerB=0;
            answerC=1;
            answerD=2;
        }

        answers[0] = answerA;
        answers[1] = answerB;
        answers[2] = answerC;
        answers[3] = answerD;

        return answers;
    }
    public  void feedBackAnswer(View view){
       if((num_question+1) < trivia.getOnePlay().size()) {
           Button b = (Button) view;
           String buttonText = b.getText().toString();
           if (buttonText.equals(answerCorrect)) {
               Intent theIntent = new Intent(this, ActivityGoodAnswer.class);
               startActivity(theIntent);
               setQuestion(++num_question);
           } else {
               Intent theIntent = new Intent(this, ActivityBadAnswer.class);
               theIntent.putExtra("FEEDBACK", feedback);
               startActivity(theIntent);
               setQuestion(++num_question);
           }
       }else{
           Intent theIntent = new Intent(this, ActivityFeedBack.class);
           startActivity(theIntent);
       }
    }

    public void btn_answerA(View view){
       feedBackAnswer(view);
    }
    public void btn_answerB(View view){
       feedBackAnswer(view);
    }
    public void btn_answerC(View view){
       feedBackAnswer(view);
    }
    public void btn_answerD(View view){
       feedBackAnswer(view);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        initialize();
        setQuestion(0);
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
    public int getDrawableIdFromQuestionId(int questionId){
        int drawableId =R.drawable.cholado_xhdpi;
        if(questionId==1){
            drawableId = R.drawable.cholado_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==2){
            drawableId = R.drawable.empanada_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==3){
            drawableId = R.drawable.mazamorra_xhdpi;
                mpMazamorra.start();

            btn_replay.setEnabled(true);
            btn_replay.setOnClickListener( new View.OnClickListener() {
                public void onClick(View view){
                    mpMazamorra.start();
                }
            });


        }
        if(questionId==4){
            drawableId = R.drawable.napa_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==5){

            btn_replay.setEnabled(false);

        }
        if(questionId==6){
            drawableId = R.drawable.oiga_xhdpi;
            mpVea.start();

            btn_replay.setEnabled(true);
            btn_replay.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    mpVea.start();
                }
            });
        }
        if(questionId==7){
            drawableId = R.drawable.radio_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==8){
            drawableId = R.drawable.calenas_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==9){
            drawableId = R.drawable.salsa_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==10){
            drawableId = R.drawable.pance_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==11){
            btn_replay.setEnabled(false);
            drawableId = R.drawable.trescruces_xhdpi;
        }
        if(questionId==12){
            drawableId = R.drawable.cuenteros_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==13){
            drawableId = R.drawable.ermita_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==14){
            drawableId = R.drawable.feria_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==15){
            drawableId = R.drawable.alumbrado_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==16){
            drawableId = R.drawable.macetas_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId==17){
            drawableId = R.drawable.cometa_xhdpi;
            btn_replay.setEnabled(false);
        }
        if(questionId>=18){
            drawableId = R.drawable.palabras_xhdpi;
            btn_replay.setEnabled(false);
        }
        return drawableId;


    }
}
