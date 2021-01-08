package com.example.rentagown;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.rentagown.Fragment.HomeFragment;

public class FormConfirmationActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton back;
    Button btnConfirm, btnContinueBooking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_confirmation);

        //INIT VIEW
        back = findViewById(R.id.im_back);
        btnConfirm = findViewById(R.id.btn_confirm);
        btnContinueBooking = findViewById(R.id.btn_continue_booking);

        //SET LISTENER
        back.setOnClickListener(this);
        btnConfirm.setOnClickListener(this);
        btnContinueBooking.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.im_back:
                finish();
                break;

//            case R.id.btn_continue_booking:
//                Intent backBooking = new Intent(FormConfirmationActivity.this, HomeFragment.class);
//                startActivity(backBooking);
//                break;


        }

    }
}