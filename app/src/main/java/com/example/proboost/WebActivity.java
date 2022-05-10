package com.example.proboost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Browser;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class WebActivity extends AppCompatActivity {
    WebView webView ;
    Browser browser ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);


        webView = findViewById(R.id.webView);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://webrtctest-5407b.web.app/");
    }
}