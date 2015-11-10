package com.drake.howtu.howtu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.webkit.WebView;


public class GifWebView extends WebView {

    public GifWebView(Context context, String path){
        super(context);
        loadUrl(path);
    }
}
