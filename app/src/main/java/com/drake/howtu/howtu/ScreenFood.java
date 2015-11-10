package com.drake.howtu.howtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ScreenFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_food);
    }

    //the below methods simply pass the url into our webview call for each different button
    public void button1 (View view){
        toWebView("http://allrecipes.com/recipe/78299/boilermaker-tailgate-chili/?internalSource=recipe%20hub&referringId=173&referringContentType=recipe%20hub");
    }

    public void button2 (View view){
        toWebView("http://allrecipes.com/recipe/162760/fluffy-pancakes/?internalSource=hn_carousel%2001_Fluffy%20Pancakes&referringId=151&referringContentType=recipe%20hub&referringPosition=carousel%2001");
    }

    public void button3 (View view){
        toWebView("http://allrecipes.com/recipe/9804/urban-legend-chocolate-chip-cookies/?internalSource=hn_carousel%2001_Urban%20Legend%20Chocolate%20Chip%20Cookies&referringId=839&referringContentType=recipe%20hub&referringPosition=carousel%2001");
    }

    public void button4 (View view){
        toWebView("http://allrecipes.com/recipe/21353/italian-spaghetti-sauce-with-meatballs/?internalSource=search%20result&referringContentType=search%20results");
    }

    public void button5 (View view){
        toWebView("http://allrecipes.com/recipe/23891/grilled-cheese-sandwich/?internalSource=search%20result&referringContentType=search%20results");
    }

    public void button6 (View view){
        toWebView("http://allrecipes.com/recipe/221286/traditional-mexican-guacamole/?internalSource=hn_carousel%2001_Traditional%20Mexican%20Guacamole&referringId=434&referringContentType=recipe%20hub&referringPosition=carousel%2001");
    }

    public void button7 (View view){
        toWebView("http://allrecipes.com/recipe/7016/french-toast-i/?internalSource=recipe%20hub&referringId=149&referringContentType=recipe%20hub");
    }

    public void button8 (View view){
        toWebView("http://allrecipes.com/recipe/143667/brookes-best-bombshell-brownies/?internalSource=recipe%20hub&referringId=1562&referringContentType=recipe%20hub");
    }

    public void button9 (View view){
        toWebView("http://allrecipes.com/recipe/13829/roasted-garlic-mashed-potatoes/?internalSource=hn_carousel%2001_Roasted%20Garlic%20Mashed%20Potatoes&referringId=1457&referringContentType=recipe%20hub&referringPosition=carousel%2001");
    }



    //passes the URL into the webview and calls the webview
    public void toWebView(String URL)
    {
        Intent intent = new Intent(ScreenFood.this, HowTuWebView.class);

        intent.putExtra("URL Entered", URL);

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen_food, menu);
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
