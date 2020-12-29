package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rentagown.Adapter.PageAdapterNotification;
import com.google.android.material.tabs.TabLayout;

public class NotificationActivity extends AppCompatActivity implements View.OnClickListener {

    TabLayout tabNotification;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        tabNotification = findViewById(R.id.tab_notification);
        final ViewPager viewPager = findViewById(R.id.vp_notification);

        //Set Tab Layout
        tabNotification.addTab(tabNotification.newTab().setText("Transaction"));
        tabNotification.addTab(tabNotification.newTab().setText("Promo"));

        final PageAdapterNotification pageAdapterNotification = new PageAdapterNotification(this, getSupportFragmentManager(), tabNotification.getTabCount());
        viewPager.setAdapter(pageAdapterNotification);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabNotification));
        tabNotification.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        //Set Listener
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;
        }
    }
}