package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.rentagown.Adapter.OnBoardingAdapter;
import com.example.rentagown.Model.OnBoadingItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class OnBoardingActivity extends AppCompatActivity{

    private ViewPager screenPager;
    OnBoardingAdapter onBoardingAdapter;
    TabLayout tabIndicator;
    Button btnNext, btnGetStarted, btnSkip;
    Animation btnAnim;
    int position = 0;
    List<OnBoadingItem> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        //Init View
        screenPager = findViewById(R.id.screen_viewpager);
        tabIndicator = findViewById(R.id.tab_indicator);
        btnNext = findViewById(R.id.btn_next);
        btnGetStarted = findViewById(R.id.btn_get_started);
        btnSkip = findViewById(R.id.btn_skip);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);

        showSystemUI();


        //Fill list screen
        mList.add(new OnBoadingItem(
                "Prewedding",
                "The chapter where the solitude ends and togetherness begins is about to start. " +
                        "Welcoming this chapter with special dress, sincere smiles, and loving memories.",
                R.drawable.bg_prewedding));

        mList.add(new OnBoadingItem(
                "Wedding",
                "We are here to help you find the perfect dress for the day that you will cherish for the rest of your life.",
                R.drawable.bg_wedding));

        mList.add(new OnBoadingItem(
                "Family",
                "Nothing is more important than making a wonderful memory with your loved ones. " +
                        "Find your stunning dress to make it even memorable.",
                R.drawable.bg_family));

        mList.add(new OnBoadingItem(
                "Maternity",
                "Wrapped yourself in magical dresses to welcome a grand adventure of your life.",
                R.drawable.bg_maternity));

        mList.add(new OnBoadingItem(
                "A more flexible way to rent",
                "We want to give our customers the best experience, and now we have made renting a dress way simpler and easier. ",
                R.drawable.bg_getstarted));


        //Setup View Pager
        onBoardingAdapter = new OnBoardingAdapter(this, mList);
        screenPager.setAdapter(onBoardingAdapter);

        //Setup TabLayout with ViewPager
        tabIndicator.setupWithViewPager(screenPager);

        //Next Button Click Listener
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = screenPager.getCurrentItem();
                if (position < mList.size()){
                    position++;
                    screenPager.setCurrentItem(position);
                }

                if (position == mList.size()-1){

                    //TODO : show the GET STARTED Button and hide next Button
                    loadLastScreen();
                }
            }
        });

        //Skip Button Click Listener
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ketika activiy ini akan di launch, kita perlu memeriksa apakah sudah dibuka sebelumnya atau tidak

                finishOnboarding();

//                if (restorePredData()){
//                    Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class);
//                    startActivity(mainActivity);
//                    finish();
//                }

            }
        });

        //Get Started Button Click Listener
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //also we need to save a boolean value to storage so next time when the user run the app
                //we could know that he is already checked the intro screen activity
                //use shared preferences to that process
                finishOnboarding();
//                Intent main = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(main);
//                savePrefsData();
                finish();
            }
        });

        tabIndicator.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == mList.size()-1){
                    loadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

    private void finishOnboarding() {
        // Get the shared preferences
        SharedPreferences preferences =
                getSharedPreferences("my_preferences", MODE_PRIVATE);

        // Set onboarding_complete to true
        preferences.edit()
                .putBoolean("onboarding_complete",true).apply();

        // Launch the main Activity, called MainActivity
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);

        // Close the OnboardingActivity
        finish();
    }


//    private boolean restorePredData() {
//        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
//        return pref.getBoolean("isIntroOpened",false);
//    }
//
    private void savePrefsData() {
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean("isIntroOpened", true);
        editor.apply();
    }

    //show the GET STARTED Button and hide next Button
    private void loadLastScreen() {
        btnNext.setVisibility(View.INVISIBLE);
//        tabIndicator.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);

        //TODO: ADD an animation the get started button
        btnGetStarted.setAnimation(btnAnim);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

}
