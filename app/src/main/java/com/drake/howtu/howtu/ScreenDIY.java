package com.drake.howtu.howtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class ScreenDIY extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_diy);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen_diy, menu);
        return true;
    }

    //create code for buttons to go to predetermined webpages
    public void button2(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.craftyarncouncil.com/instructions_kn.php3";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button3(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.craftyarncouncil.com/instructions_cr.php3";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button4(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.craftyarncouncil.com/instructions_cr.php3";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button5(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.ballstothewallsknits.com/2014/12/around-we-go-headband.html";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button6(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.mooglyblog.com/neptunes-stripes-blanket/";

        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button7(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.wikihow.com/Make-a-Fleece-Tie-Blanket";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button8(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://blog.consumercrafts.com/seasonal/winter/loom-knit-boot-cuffs/";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button9(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://ourbestbites.com/2010/09/kids-in-the-kitchen-slime/";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button10(View view) {

        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.wikihow.com/Make-Sand-Art";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
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
