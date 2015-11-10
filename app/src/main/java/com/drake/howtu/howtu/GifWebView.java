package com.drake.howtu.howtu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;

//custom webview class for displaying the gif
public class GifWebView extends WebView {

    public GifWebView(Context context, String path){
        super(context);
        loadUrl(path);
    }
}
