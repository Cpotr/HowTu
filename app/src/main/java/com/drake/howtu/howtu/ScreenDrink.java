package com.drake.howtu.howtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ScreenDrink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_drink);
    }

    public void button1 (View view){
        toWebView("http://www.seriouseats.com/recipes/2010/06/the-martini-recipe.html");
    }

    public void button2 (View view){
        toWebView("http://www.seriouseats.com/recipes/2008/06/traditional-old-fashioned-recipe.html");
    }

    public void button3 (View view){
        toWebView("http://www.seriouseats.com/recipes/2008/01/cocktails-manhattan-recipe.html");
    }

    public void button4 (View view){
        toWebView("http://www.seriouseats.com/recipes/2008/05/daiquiri-recipe.html");
    }

    public void button5 (View view){
        toWebView("http://www.seriouseats.com/recipes/2015/04/classic-margarita-recipe-tequila-cocktail.html");
    }

    public void button6 (View view){
        toWebView("http://www.seriouseats.com/recipes/2011/06/the-ultimate-fully-loaded-bloody-mary-recipe.html");
    }

    public void button7 (View view){
        toWebView("http://www.seriouseats.com/recipes/2007/10/cocktails-whiskey-sour.html");
    }

    public void button8 (View view){
        toWebView("http://www.seriouseats.com/recipes/2011/10/how-to-make-a-cosmopolitan-cocktail-best-recipe.html");
    }

    public void button9 (View view){
        toWebView("http://www.seriouseats.com/recipes/2011/10/mojito-rum-mint-cocktail-recipe.html");
    }


    public void toWebView(String URL)
    {
        Intent intent = new Intent(ScreenDrink.this, HowTuWebView.class);

        intent.putExtra("URL Entered", URL);

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_screen_drink, menu);
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
