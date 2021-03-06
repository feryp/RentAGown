package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DetailPromoActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton back;
    Button btnUsePromo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_promo);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnUsePromo = findViewById(R.id.btn_use_promo);

        //SET LISTENER
        back.setOnClickListener(this);
        btnUsePromo.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_use_promo:
                break;
        }
    }
}