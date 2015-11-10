package com.drake.howtu.howtu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.urlBar);

        editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(v);
                }
            }
        });
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_GO) {
                    Intent intent = new Intent(MainActivity.this, HowTuWebView.class);
                    EditText urlEntry = (EditText) findViewById(R.id.urlBar);

                    intent.putExtra("URL Entered", urlEntry.getText().toString());

                    startActivity(intent);
                    handled = true;
                }
                return handled;
            }
        });
    }

    //sets focus within the app
    //needed for click
    public void onClick(View view) {
        InputMethodManager imm = (InputMethodManager) view.getContext()
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    //hides the keyboard when text box is not focus on
    public void hideKeyboard(View view) {
        InputMethodManager inputMethodManager =(InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public void toWebView(View view)
    {
        Intent intent = new Intent(this, HowTuWebView.class);
        EditText urlEntry = (EditText)findViewById(R.id.urlBar);

        intent.putExtra("URL Entered", urlEntry.getText().toString());

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

    public void toTutorial(View view)
    {
        Intent intent = new Intent(this, tutorial_full.class);
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
