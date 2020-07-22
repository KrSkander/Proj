package com.example.movietracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    String url;
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView =(WebView)findViewById(R.id.webView);

//        inserer le site heberger:
//        url = "https://www..com";

        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle( View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);
    }
}