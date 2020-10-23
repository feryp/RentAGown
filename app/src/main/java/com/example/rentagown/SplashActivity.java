package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent onBoarding = new Intent(SplashActivity.this, OnBoardingActivity.class);
                startActivity(onBoarding);
                finish();
            }
        },SPLASH_SCREEN);
    }
}
