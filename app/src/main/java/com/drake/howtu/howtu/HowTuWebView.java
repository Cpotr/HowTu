package com.drake.howtu.howtu;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class HowTuWebView extends AppCompatActivity {

    private WebView mWebView;
    private Timer inactivityTimer;
    private MyTimerTask inactivityTask;

    @TargetApi(Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_tu_web_view);

        Intent PassedValues = getIntent();
        String urlEntered = "http://beta.html5test.com/";

        if(!Objects.equals(PassedValues.getStringExtra("URL Entered"), ""))
        {
            urlEntered = PassedValues.getStringExtra("URL Entered");
        }

        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        mWebView.setWebViewClient(new customWebViewClient());

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl(urlEntered);

        //Toast toast = Toast.makeText(getApplicationContext(), urlEntered, Toast.LENGTH_SHORT);
        //toast.show();

        timerToBlackout();
    }

    class MyTimerTask extends TimerTask {
        @Override
        public void run(){
            Intent intent = new Intent(HowTuWebView.this, Blackout.class);
            startActivity(intent);
        }
    }

    public void timerToBlackout() {
        inactivityTimer = new Timer();
        inactivityTask = new MyTimerTask();
        inactivityTimer.schedule(inactivityTask, 10000);
    }

    @Override
    public void onUserInteraction() {
        inactivityTask.cancel();
        timerToBlackout();
    }

    @Override
    public void onPause() {
        super.onPause();
        inactivityTask.cancel();
    }

    /*
    @Override
    public void onResume() {
        super.onResume();

        inactivityTask.cancel();
        timerToBlackout();
    }
    */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_how_tu_web_view, menu);
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

    private class customWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}
