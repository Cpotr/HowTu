package com.drake.howtu.howtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ScreenAuto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_auto);
    }

    //create code for buttons to go to predetermined webpages
    public void button1(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.dmv.org/how-to-guides/changing-tire.php";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button2(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "https://www.allstate.com/tools-and-resources/car-insurance/check-replace-wipers-blades.aspx";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button3(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.dmv.org/how-to-guides/fuse.php";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button4(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.wikihow.com/Change-Spark-Plugs-in-a-Car";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button5(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.wikihow.com/Check-the-Fluids-in-a-Car";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button6(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.dmv.org/how-to-guides/headlight.php";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button7(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.wikihow.com/Change-Your-Air-Filter";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button8(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.wikihow.com/Flush-a-Radiator";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    public void button9(View view) {
        Intent intent = new Intent(this, HowTuWebView.class);
        String url = "http://www.edmunds.com/how-to/how-to-change-your-brake-pads.html";
        intent.putExtra("URL Entered", url);

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen_auto, menu);
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
