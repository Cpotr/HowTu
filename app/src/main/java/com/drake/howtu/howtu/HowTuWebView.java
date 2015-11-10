package com.drake.howtu.howtu;

import android.annotation.TargetApi;
import android.content.Intent;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
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

    //Variables for checking for sound
    private static final int sampleRate = 8000;
    private AudioRecord audio;
    private int bufferSize;
    private double lastLevel = 0;
    private Thread thread;
    private static final int SAMPLE_DELAY = 25;
    private boolean bottom = true;

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

        if(urlEntered.charAt(0) != 'h' && urlEntered.charAt(1) != 't' && urlEntered.charAt(2) != 't' && urlEntered.charAt(3) != 'p')
        {
            urlEntered = "http://" + urlEntered;
        }

        mWebView = (WebView) findViewById(R.id.activity_main_webview);
        mWebView.setWebViewClient(new customWebViewClient());

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl(urlEntered);

        try {
            bufferSize = AudioRecord
                    .getMinBufferSize(sampleRate, AudioFormat.CHANNEL_IN_MONO,
                            AudioFormat.ENCODING_PCM_16BIT);
        } catch (Exception e) {
            android.util.Log.e("TrackingFlow", "Exception", e);
        }

        timerToBlackout();
    }

    //Code was taken from the internet and is used to get the sound level from a constant recording
    //on the device
    protected void onResume() {
        super.onResume();
        audio = new AudioRecord(MediaRecorder.AudioSource.MIC, sampleRate,
                AudioFormat.CHANNEL_IN_MONO,
                AudioFormat.ENCODING_PCM_16BIT, bufferSize);

        audio.startRecording();
        thread = new Thread(new Runnable() {
            public void run() {
                while(thread != null && !thread.isInterrupted()){
                    //Let's make the thread sleep for a the approximate sampling time
                    try{Thread.sleep(SAMPLE_DELAY);}catch(InterruptedException ie){ie.printStackTrace();}

                    lastLevel = 0;

                    readAudioBuffer();//After this call we can get the last value assigned to the lastLevel variable

                    runOnUiThread(new Runnable() {

                        @Override
                        public void run() {
                            //Here is where we enter in the functionality for what
                            //we want the method to do

                            //The if statement checks last level, sets the volume needed to call the method
                            if(lastLevel > 275 )
                            {
                                //Scrolls the webview down
                                mWebView.pageDown(false);

                                inactivityTask.cancel();

                                timerToBlackout();
                            }
                        }
                    });
                }
            }
        });
        thread.start();
    }

    /**
     * Functionality that gets the sound level out of the sample
     */
    private void readAudioBuffer() {

        try {
            short[] buffer = new short[bufferSize];

            int bufferReadResult = 1;

            if (audio != null) {

                // Sense the voice...
                bufferReadResult = audio.read(buffer, 0, bufferSize);
                double sumLevel = 0;
                for (int i = 0; i < bufferReadResult; i++) {
                    sumLevel += buffer[i];
                }
                lastLevel = Math.abs((sumLevel / bufferReadResult));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
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
        thread.interrupt();
        thread = null;
        try {
            if (audio != null) {
                audio.stop();
                audio.release();
                audio = null;
            }
        } catch (Exception e) {e.printStackTrace();}
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
