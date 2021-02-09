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


        //Fill list screen
        mList.add(new OnBoadingItem(
                "Prewedding",
                "The special day that is coming soon will not be memorable without stunning clothes, " +
                        "we are here to bring that to you.",
                R.drawable.bg_prewedding));

        mList.add(new OnBoadingItem(
                "Wedding",
                "A dazzling collection available for you to use on your special day, creating unforgettable memories for a lifetime.",
                R.drawable.bg_wedding));

        mList.add(new OnBoadingItem(
                "Family",
                "Looking different is about showing inner beauty from another perspective, and that's what someone like you needs.",
                R.drawable.bg_family));

        mList.add(new OnBoadingItem(
                "Maternity",
                "Looking different is about showing inner beauty from another perspective, and that's what someone like you needs.",
                R.drawable.bg_maternity));

        mList.add(new OnBoadingItem(
                "A more flexible way to rent",
                "We are here to make it easy for you to choose clothes that are suitable for " +
                        "all your important activities so that you appear different from the others.",
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

}
