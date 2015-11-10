package com.drake.howtu.howtu;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class FirstRunActivity extends AppCompatActivity {

    //SharedPreferences pref;
    //SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences settings = getSharedPreferences("HowTu", 0);
        boolean firstRun = settings.getBoolean("firstRun", false);

        if(!firstRun)
        {
            SharedPreferences.Editor editor=settings.edit();
            editor.putBoolean("firstRun", true);
            editor.commit();
            Intent i= new Intent(this, tutorial.class);
            startActivity(i);
            finish();
        }
        else
        {
            Intent a=new Intent(FirstRunActivity.this, MainActivity.class);
            startActivity(a);
            finish();
        }
    }
}
