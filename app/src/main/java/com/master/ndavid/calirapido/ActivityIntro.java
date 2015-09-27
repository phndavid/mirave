package com.master.ndavid.calirapido;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class ActivityIntro extends ActionBarActivity {

    private TextView txt_intro;
    private Typeface tf;
    private Trivia trivia;


    public void play(View view){
        Intent theIntent = new Intent(this, ActivityQuestion.class);
        //theIntent.putExtra("")
        startActivity(theIntent);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_intro);
        tf= Typeface.createFromAsset(getAssets(), "fonts/Walkway SemiBold.ttf");
        txt_intro = (TextView) findViewById(R.id.txt_intro);
        txt_intro.setTypeface(tf);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_intro, menu);
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
