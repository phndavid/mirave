package com.master.ndavid.calirapido;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class ActivityPlay extends ActionBarActivity {


    private Typeface tf;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        relativeLayout = (RelativeLayout) findViewById(R.id.relaPlay);
        tf= Typeface.createFromAsset(getAssets(), "fonts/Walkway SemiBold.ttf");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play, menu);
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
    public void jugar(View view){
        Intent theIntent = new Intent(this, ActivityIntro.class);
        startActivity(theIntent);
        finish();
    }
}
