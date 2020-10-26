package com.example.rentagown;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.example.rentagown.Fragment.BookFragment;
import com.example.rentagown.Fragment.HomeFragment;
import com.example.rentagown.Fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;
    Fragment selectedFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();

        //INIT VIEW
        bottomNavigationView = findViewById(R.id.bot_nav);
        frameLayout = findViewById(R.id.fragment_container);

        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId()){
                        case R.id.nav_home:
                            selectedFragment = new HomeFragment();
                            bottomNavigationView.setItemIconTintList(null);
                            break;

                        case R.id.nav_booking:
                            selectedFragment = new BookFragment();
                            bottomNavigationView.setItemIconTintList(null);
                            break;

                        case R.id.nav_profile:
                            selectedFragment = new ProfileFragment();
                            bottomNavigationView.setItemIconTintList(null);
                            break;
                    }
                    if (selectedFragment != null){
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    }
                    return true;
                }
            };
}
