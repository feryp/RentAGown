package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class DetailBookingActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    TextView editDate;
    Button  btnPay, btnFittingSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_booking);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        editDate = findViewById(R.id.btn_edit_date);
        btnPay = findViewById(R.id.btn_pay_detail_booking);
        btnFittingSize = findViewById(R.id.btn_fitting_size_detail_booking);

        //SET LISTENER
        back.setOnClickListener(this);
        editDate.setOnClickListener(this);
        btnPay.setOnClickListener(this);
        btnFittingSize.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

            case R.id.btn_edit_date:
                Intent edit = new Intent(DetailBookingActivity.this, DateBookingActivity.class);
                startActivity(edit);
                break;

            case R.id.btn_pay_detail_booking:
                Intent pay = new Intent(DetailBookingActivity.this, FormConfirmationActivity.class);
                startActivity(pay);
                break;

            case R.id.btn_fitting_size_detail_booking:
                Intent fittingSize = new Intent(DetailBookingActivity.this, FittingSizeActivity.class);
                startActivity(fittingSize);
                break;
        }
    }
}