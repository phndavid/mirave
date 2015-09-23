package com.master.ndavid.calirapido;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class ActivityGoodAnswer extends ActionBarActivity {
    private Typeface tf;
    private boolean finish;
    private double score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_good_answer);
        Bundle bundle = getIntent().getExtras();
        finish = bundle.getBoolean("ultima");
        score = bundle.getDouble("puntaje");
        tf= Typeface.createFromAsset(getAssets(), "fonts/Walkway SemiBold.ttf");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_good_answer, menu);
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
    public void continued(View view){
        if(finish){
            Intent theIntent = new Intent(this, ActivityFeedBack.class);
            theIntent.putExtra("puntajeF",score);
            startActivity(theIntent);
            finish();
        }else{
            finish();
        };
    }
}
