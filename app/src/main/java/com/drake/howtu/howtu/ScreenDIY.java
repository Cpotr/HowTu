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
    public void button1(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.popularmechanics.com/home/how-to/a3095/5-steps-to-fix-a-leaky-faucet-15470175/";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button2(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.wikihow.com/Unclog-a-Shower-Drain";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button3(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://homeguides.sfgate.com/remove-upipe-under-sink-24864.html";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button4(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://homeguides.sfgate.com/test-household-water-pressure-20231.html";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button5(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.wikihow.com/Replace-Damaged-Roof-Shingles";

        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button6(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.wikihow.com/Caulk-Windows";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button7(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.lowes.com/projects/paint-stain-and-wallpaper/paint-a-room/project";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button8(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.diynetwork.com/how-to/skills-and-know-how/plumbing/how-to-drain-a-water-heater";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button9(View view) {

        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.realsimple.com/home-organizing/home-improvement/do-it-yourself-save-big/replace-doorknob-hidden-screws";
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
