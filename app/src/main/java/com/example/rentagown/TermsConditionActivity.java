package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class TermsConditionActivity extends AppCompatActivity {

    private WebView webView;
    private ImageButton back;
    private SwipeRefreshLayout swipe;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_condition);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        swipe = findViewById(R.id.swipe_refresh_terms_condition);
        progressBar = findViewById(R.id.progress_bar_terms_condition);

        LoadWeb();

        progressBar.setMax(100);
        progressBar.setProgress(1);

        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                webView.reload();
            }
        });

        webView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                progressBar.setProgress(newProgress);
            }
        });

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressBar.setVisibility(View.VISIBLE);

            }

            @Override
            public void onPageFinished(WebView view, String url) {
                //hide SwipeRefreshLayout
                progressBar.setVisibility(View.GONE);
                swipe.setRefreshing(false);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    @SuppressLint("SetJavaScriptEnabled")
    private void LoadWeb() {
        webView = findViewById(R.id.webview_terms_condition);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.loadUrl("https://rentagown.absdigital.co.id/terms-conditions/");
        swipe.setRefreshing(true);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        } else {
            finish();
        }
    }
}