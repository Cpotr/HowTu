package com.drake.howtu.howtu;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.webkit.WebView;

/**
 * Created by maxitaxi_kindred on 11/2/15.
 */
public class GifWebView extends WebView {

    public GifWebView(Context context, String path){
        super(context);
        loadUrl(path);
    }
}
