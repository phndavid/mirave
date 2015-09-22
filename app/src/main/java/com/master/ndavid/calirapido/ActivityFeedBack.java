package com.master.ndavid.calirapido;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class ActivityFeedBack extends ActionBarActivity {

    public static final int CERO = R.drawable.rolo_xhdpi;
    public static final int UNO = R.drawable.barrio_xhdpi;
    public static final int DOS = R.drawable.culturizate_xhdpi;
    public static final int TRES = R.drawable.pelo_xhdpi;
    public static final int CUATRO = R.drawable.caleno_xhdpi;

    private double score;
    private TextView txtPuntaje;
    private RelativeLayout relativeLayout;

    public void btn_newGame(View view){
        Intent theIntent = new Intent(this, ActivityIntro.class);
        startActivity(theIntent);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_feed_back);
        txtPuntaje = (TextView) findViewById(R.id.txt_puntaje);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeF);
        Bundle bundle = getIntent().getExtras();
        score=0;
        score = bundle.getDouble("puntajeF");
        int theScore = new Double(score).intValue();
        relativeLayout.setBackgroundResource(definirFondo(theScore));
        txtPuntaje.setText("Puntaje: " + theScore + "%");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_feed_back, menu);
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
    public int definirFondo(int puntaje){
        int fondo = 0;
        if(puntaje==0){
            fondo = CERO;
        }
        if(puntaje>0 && puntaje<25){
            fondo=UNO;
        }
        if(puntaje>=25 && puntaje<50){
            fondo=DOS;
        }
        if(puntaje>=50 && puntaje<75){
            fondo=TRES;
        }
        if(puntaje>=75){
            fondo=CUATRO;
        }
        return fondo;
    }
}
