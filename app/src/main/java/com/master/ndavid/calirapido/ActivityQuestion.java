package com.master.ndavid.calirapido;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
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
    private Bitmap background;
    private BitmapDrawable back;
    private int idBackgroundActual;
    private  MediaPlayer mpMazamorra;
    private  MediaPlayer mpVea;
    private int idsQuestionImages[] = {
            R.drawable.cholado_xhdpi,R.drawable.empanada_xhdpi,R.drawable.mazamorra_xhdpi,R.drawable.napa_xhdpi,R.drawable.oiga_xhdpi,
            R.drawable.oiga_xhdpi, R.drawable.radio_xhdpi,R.drawable.calenas_xhdpi,R.drawable.salsa_xhdpi,
            R.drawable.pance_xhdpi,R.drawable.trescruces_xhdpi, R.drawable.cuenteros_xhdpi,R.drawable.ermita_xhdpi,
            R.drawable.feria_xhdpi,R.drawable.alumbrado_xhdpi,R.drawable.macetas_xhdpi,R.drawable.cometa_xhdpi,R.drawable.palabras_xhdpi,
            R.drawable.palabras_xhdpi,R.drawable.palabras_xhdpi,R.drawable.palabras_xhdpi};
    private int idsOptionsImages[] ={R.drawable.aama_xhdpi,R.drawable.bama_xhdpi, R.drawable.aazul_xhdpi,R.drawable.bazul_xhdpi,
            R.drawable.arojo_xhdpi,R.drawable.brojo_xhdpi,R.drawable.averde_xhdpi,R.drawable.bverde_xhdpi,
            R.drawable.aoro_xhdpi,R.drawable.boro_xhdpi,R.drawable.anaranja_xhdpi,R.drawable.bnaranja_xhdpi,
            R.drawable.arosa_xhdpi,R.drawable.brosa_xhdpi  };

    private String colors[] ={"amarillo","azul","rojo","verde","oro","naranja","rosa"};
    public int getIdOptions(String color){
            if(colors[0].equals(color)){
                return 0;
            }
            if(colors[1].equals(color)){
                return 2;
            }
            if(colors[2].equals(color)){
                return 4;
            }
            if(colors[3].equals(color)){
                return 6;
            }
            if(colors[4].equals(color)){
                return 8;
            }
            if(colors[5].equals(color)){
                return 10;
            }
            if(colors[6].equals(color)) {
                return 12;
            }
        return 0;
    }
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
        mpVea = MediaPlayer.create(this, R.raw.vea);


    }
    public void setQuestion(int num){
        ArrayList<Question> questions = trivia.getOnePlay();
        Question question = questions.get(num);
        int id = question.getId();
        int draId = getDrawableIdFromQuestionId(id);
        idBackgroundActual = draId;
        //relativeLayout.setBackgroundResource(draId);
        loadBackground(draId);
        ArrayList<Answer> optionsAnswer = question.getOptionsAnswers();
        txt_question.setText(question.getQuestion());
        answerCorrect = optionsAnswer.get(0).getAnswer();
        int[] answers = answerswithoutRepeating();
        String color = question.getColor();
        int idOptions = getIdOptions(color);
        Drawable drawable_a = getResources().getDrawable(idsOptionsImages[idOptions]);
        Drawable drawable_b = getResources().getDrawable(idsOptionsImages[idOptions + 1]);
        answer_a.setText(optionsAnswer.get(answers[0]).getAnswer());
        answer_a.setBackground(drawable_a);
        answer_b.setText(optionsAnswer.get(answers[1]).getAnswer());
        answer_b.setBackground(drawable_b);
        answer_c.setText(optionsAnswer.get(answers[2]).getAnswer());
        answer_c.setBackground(drawable_a);
        answer_d.setText(optionsAnswer.get(answers[3]).getAnswer());
        answer_d.setBackground(drawable_b);

        feedback = question.getExplain();

    }
    public void loadBackground(int id){
        background = BitmapFactory.decodeStream(getResources().openRawResource(id));
        back = new BitmapDrawable(getResources(),background);
        relativeLayout.setBackground(back);
    }
    public void unloadBackground(){
        if(relativeLayout!=null){
            relativeLayout.setBackground(null);
        }
        if(back!=null){
            background.recycle();
        }
        back=null;
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
               trivia.preguntaBuena();
               Intent theIntent = new Intent(this, ActivityGoodAnswer.class);
               theIntent.putExtra("puntaje",0.0);
               theIntent.putExtra("ultima",false);
               startActivity(theIntent);
               setQuestion(++num_question);
               
           } else {
               Intent theIntent = new Intent(this, ActivityBadAnswer.class);
               theIntent.putExtra("FEEDBACK", feedback);
               theIntent.putExtra("puntaje",0.0);
               theIntent.putExtra("ultima",false);
               startActivity(theIntent);
               setQuestion(++num_question);
           }
       }else{
           Button b = (Button) view;
           String buttonText = b.getText().toString();
           if(buttonText.equals(answerCorrect)){
               Intent theIntent = new Intent(this, ActivityGoodAnswer.class);
               trivia.calcularPorcentajePartida();
               theIntent.putExtra("puntaje",trivia.getPuntajeTotal());
               theIntent.putExtra("ultima",true);
               finish();
               startActivity(theIntent);
           }else{
               Intent theIntent = new Intent(this, ActivityBadAnswer.class);
               theIntent.putExtra("FEEDBACK", feedback);
               trivia.calcularPorcentajePartida();
               theIntent.putExtra("puntaje",trivia.getPuntajeTotal());
               theIntent.putExtra("ultima",true);
               finish();
               startActivity(theIntent);
           }
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
    public int getDrawableIdFromQuestionId(int questionId) {
        int drawableId = R.drawable.cholado_xhdpi;

        for (int i = 0; i < idsQuestionImages.length; i++) {
            if (questionId == (i + 1)) {
                btn_replay.setEnabled(false);

                if(mpMazamorra.isPlaying()){
                        mpMazamorra.stop();
                    }

                if(mpVea.isPlaying()){
                    mpVea.stop();
                }

                if (questionId == 3) {

                    btn_replay.setEnabled(true);
                    mpMazamorra.start();
                    btn_replay.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            mpMazamorra.start();
                        }
                    });
                }
                   if (questionId == 6) {

                    btn_replay.setEnabled(true);
                    mpVea.start();
                    btn_replay.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            mpVea.start();
                        }
                    });
                }

                return idsQuestionImages[i];
            }
        }
        return drawableId;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        initialize();
        setQuestion(0);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unloadBackground();
    }

    @Override
    protected void onPause() {
        super.onPause();
        unloadBackground();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadBackground(idBackgroundActual);
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
