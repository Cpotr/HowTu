package com.drake.howtu.howtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ScreenCrafts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_crafts);
    }

    public void button1 (View view){
        toWebView("http://www.craftyarncouncil.com/instructions_kn.php3");
    }

    public void button2 (View view){
        toWebView("http://www.craftyarncouncil.com/instructions_cr.php3");
    }

    public void button3 (View view){
        toWebView("http://www.wikihow.com/Knit-a-Scarf");
    }

    public void button4 (View view){
        toWebView("http://www.ballstothewallsknits.com/2014/12/around-we-go-headband.html");
    }

    public void button5 (View view){
        toWebView("http://www.mooglyblog.com/neptunes-stripes-blanket/");
    }

    public void button6 (View view){
        toWebView("http://www.wikihow.com/Make-a-Fleece-Tie-Blanket");
    }

    public void button7 (View view){
        toWebView("http://blog.consumercrafts.com/seasonal/winter/loom-knit-boot-cuffs/");
    }

    public void button8 (View view){
        toWebView("http://ourbestbites.com/2010/09/kids-in-the-kitchen-slime/");
    }

    public void button9 (View view){
        toWebView("http://www.wikihow.com/Make-Sand-Art");
    }


    public void toWebView(String URL)
    {
        Intent intent = new Intent(ScreenCrafts.this, HowTuWebView.class);

        intent.putExtra("URL Entered", URL);

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen_crafts, menu);
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
