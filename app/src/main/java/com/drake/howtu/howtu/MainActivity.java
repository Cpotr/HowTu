package com.drake.howtu.howtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toWebView(View view)
    {
        Intent intent = new Intent(this, HowTuWebView.class);
        startActivity(intent);
    }

    public void toCrafts(View view)
    {
        Intent intent = new Intent(this, ScreenCrafts.class);
        startActivity(intent);
    }

    public void toStyle(View view)
    {
        Intent intent = new Intent(this, ScreenStyle.class);
        startActivity(intent);
    }

    public void toHandy(View view)
    {
        Intent intent = new Intent(this, ScreenDIY.class);
        startActivity(intent);
    }

    public void toCar(View view)
    {
        Intent intent = new Intent(this, ScreenAuto.class);
        startActivity(intent);
    }

    public void toFood(View view)
    {
        Intent intent = new Intent(this, ScreenFood.class);
        startActivity(intent);
    }

    public void toDrinks(View view)
    {
        Intent intent = new Intent(this, ScreenDrink.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
