package com.master.ndavid.calirapido;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ActivityBadAnswer extends ActionBarActivity {

    private TextView txt_explain;
    private Button btn_continue;
    private Typeface tf;
    private boolean finish;
    private double score;
    public void btn_continue(View view){
        if(finish){
            Intent theIntent = new Intent(this, ActivityFeedBack.class);
            theIntent.putExtra("puntajeF",score);
            startActivity(theIntent);
            finish();
        }else{
            finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_bad_answer);
        Bundle bundle = getIntent().getExtras();
        String explication = bundle.getString("FEEDBACK");
        finish = bundle.getBoolean("ultima");
        score = bundle.getDouble("puntaje");
        tf= Typeface.createFromAsset(getAssets(), "fonts/CaviarDreams.ttf");
        btn_continue = (Button) findViewById(R.id.btn_continue);
        btn_continue.setTypeface(tf);
        txt_explain = (TextView) findViewById(R.id.txt_explain);
        txt_explain.setTypeface(tf);
        txt_explain.setText(explication);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_bad_answer, menu);
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
