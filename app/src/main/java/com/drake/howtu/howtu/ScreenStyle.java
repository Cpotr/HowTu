package com.drake.howtu.howtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ScreenStyle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_style);
    }

    //Code to go to pre loaded tutorials
    public void button1 (View view){
        toWebView("http://www.tie-a-tie.net/fourinhand.html");
    }

    public void button2 (View view){
        toWebView("http://www.tie-a-tie.net/pratt.html");
    }

    public void button3 (View view){
        toWebView("http://www.tie-a-tie.net/halfwindsor.html");
    }

    public void button4 (View view){
        toWebView("http://www.tie-a-tie.net/windsor.html");
    }

    public void button5 (View view){
        toWebView("http://2good2lose.com/braid-french.shtml");
    }

    public void button6 (View view){
        toWebView("http://2good2lose.com/braid-fishtail.shtml");
    }

    public void button7 (View view){
        toWebView("http://www.wikihow.com/Create-a-Smoky-Eye-Effect");
    }

    public void button8 (View view){
        toWebView("http://www.wikihow.com/Tie-a-Bow-Tie");
    }

    public void button9 (View view){
        toWebView("http://www.cosmopolitan.com/style-beauty/beauty/how-to/a43730/face-shape-contour-map/");
    }

    //passes the URL into the webview and calls the webview
    public void toWebView(String URL)
    {
        Intent intent = new Intent(ScreenStyle.this, HowTuWebView.class);

        intent.putExtra("URL Entered", URL);

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen_style, menu);
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
