package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class YourBookingActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back, btnWhatsapp;
    Button btnCheckout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_booking);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnWhatsapp = findViewById(R.id.btn_whatsapp);
        btnCheckout = findViewById(R.id.btn_checkout);

        //SET LISTENER
        back.setOnClickListener(this);
        btnWhatsapp.setOnClickListener(this);
        btnCheckout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.im_back:
                finish();
                break;
            case R.id.btn_checkout:
                Intent checkout = new Intent(YourBookingActivity.this, PaymentActivity.class);
                startActivity(checkout);
                break;
        }
    }
}